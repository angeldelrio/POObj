package com.arturobarba.poo.interfaz.pantallas.tablas;

import static com.arturobarba.poo.interfaz.Salida.print;
import static com.arturobarba.poo.interfaz.Salida.println;
import static com.arturobarba.poo.utils.StringUtils.estaEnBlanco;
import static com.arturobarba.poo.utils.StringUtils.normalizarString;
import static com.arturobarba.poo.utils.StringUtils.repetirString;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.modelo.Identificable;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTabla<T extends Identificable> implements Tabla<T> {

    public static final String SEPARADOR_DOBLE = "=";
    public static final String SEPARADOR_FILAS = "-";
    public static final String SEPARADOR_VERTICAL_IZQUIERDO = "| ";
    public static final String SEPARADOR_VERTICAL_DERECHO = " |";
    public static final String SEPARADOR_VERTICAL = " | ";

    private final List<Columna> cabecera;
    private List<T> modelos;
    private final int anchoTotal;
    private T modeloSeleccionado;
    private boolean soloMostrarDatos;

    public AbstractTabla() {
        cabecera = obtenerColumnas();
        anchoTotal = calcularAnchoTotal();
        modelos = new ArrayList<>();
        soloMostrarDatos = false;
    }

    public AbstractTabla(List<T> modelos) {
        this();
        this.modelos = modelos;
    }

    @Override
    public AccionTabla<T> mostrarTabla() {
        List<Fila<T>> filas = obtenerFilas(modelos);

        mostrarCabecera();
        for (int i = 0; i < filas.size(); i++) {
            mostrarFila(filas.get(i));

            if (i == (filas.size() - 1)) {
                println(repetirString(SEPARADOR_DOBLE, anchoTotal));
                continue;
            }

            println(repetirString(SEPARADOR_FILAS, anchoTotal));
        }

        if (modelos == null || modelos.isEmpty()) {
            println("No hay resultados que mostrar");
            return null;
        }

        if (soloMostrarDatos) {
            return null;
        }

        modeloSeleccionado = seleccionarModelo();
        if (modeloSeleccionado == null) {
            return null;
        }

        List<AccionTabla<T>> acciones = obtenerAcciones();
        if (acciones != null && !acciones.isEmpty()) {
            println("Acciones disponibles");
            for (AccionTabla<T> accion : acciones) {
                println(accion.toString());
            }

            AccionTabla<T> accionSelecionada = seleccionarAccion(modeloSeleccionado);
            accionSelecionada.realizarAccion(modeloSeleccionado);

            return accionSelecionada;
        }

        return null;
    }

    @Override
    public T seleccionarModelo() {
        println("Seleccione por ID o pulse '0' para salir:");
        Integer id = null;
        try {
            id = Entrada.getInt();
        } catch (Exception e) {
            id = null;
        }

        if (id == 0) {
            return null;
        }

        T modelo = buscarModeloPorId(id);
        if (modelo == null) {
            println("ID no válido o no encontrado");
//            Entrada.next();
            return seleccionarModelo();
        }

        return modelo;
    }

    private T buscarModeloPorId(Integer id) {
        if (id == null) {
            return null;
        }

        for (T modelo : modelos) {
            if (modelo.getId().equals(id)) {
                return modelo;
            }
        }

        return null;
    }

    private AccionTabla<T> buscarAccionPorCaracter(String s) {
        if (estaEnBlanco(s)) {
            return null;
        }

        for (AccionTabla<T> accion : obtenerAcciones()) {
            if (s.equalsIgnoreCase(accion.getCaracterOpcion())) {
                return accion;
            }
        }

        return null;
    }

    @Override
    public AccionTabla<T> seleccionarAccion(T modeloSeleccionado) {
        println("Seleccione una acción para " + modeloSeleccionado.getClass().getSimpleName() + " con ID " + modeloSeleccionado.getId() + ":");
        String caracterAccion = null;
        try {
            caracterAccion = Entrada.getString();
        } catch (Exception e) {
            caracterAccion = null;
        }

        AccionTabla<T> accionSeleccionada = buscarAccionPorCaracter(caracterAccion);
        if (accionSeleccionada == null) {
            println("Acción no válida");
            return seleccionarAccion(modeloSeleccionado);
        }

        return accionSeleccionada;
    }

    @Override
    public List<Fila<T>> obtenerFilas(List<T> modelos) {
        List<Fila<T>> filas = new ArrayList<>();

        for (T modelo : modelos) {
            filas.add(convertirAFila(modelo));
        }

        return filas;
    }

    private int calcularAnchoTotal() {
        int ancho = 0;

        for (int i = 0; i < cabecera.size(); i++) {
            if (i == 0) {
                ancho += SEPARADOR_VERTICAL_IZQUIERDO.length();
            }

            String separadorDerecho = SEPARADOR_VERTICAL;
            if (i == (cabecera.size() - 1)) {
                separadorDerecho = SEPARADOR_VERTICAL_DERECHO;
            }

            ancho += cabecera.get((i)).getAncho() + separadorDerecho.length();
        }

        return ancho;
    }

    private void mostrarFila(Fila<T> fila) {
        List<String> valores = fila.getValores();

        if (valores.size() != cabecera.size()) {
            throw new RuntimeException("El número de valores de la cabecera y la fila no coinciden");
        }

        for (int i = 0; i < valores.size(); i++) {
            String separadorIzquiedo = "";
            if (i == 0) {
                separadorIzquiedo = SEPARADOR_VERTICAL_IZQUIERDO;
            }

            String separadorDerecho = SEPARADOR_VERTICAL;
            if (i == (valores.size() - 1)) {
                separadorDerecho = SEPARADOR_VERTICAL_DERECHO;
            }

            Columna colActual = cabecera.get(i);

            print(separadorIzquiedo +
                ajustarAnchoValor(valores.get(i), colActual.getAncho()) +
                separadorDerecho
            );
        }
        println("");

    }

    private void mostrarCabecera() {
        println(repetirString(SEPARADOR_DOBLE, anchoTotal));

        for (int i = 0; i < cabecera.size(); i++) {
            String separadorIzquiedo = "";
            if (i == 0) {
                separadorIzquiedo = SEPARADOR_VERTICAL_IZQUIERDO;
            }

            String separadorDerecho = SEPARADOR_VERTICAL;
            if (i == (cabecera.size() - 1)) {
                separadorDerecho = SEPARADOR_VERTICAL_DERECHO;
            }

            Columna colActual = cabecera.get(i);

            print(
                separadorIzquiedo +
                ajustarAnchoValor(colActual.getNombre(), colActual.getAncho()) +
                separadorDerecho
            );
        }
        println("");
        println(repetirString(SEPARADOR_DOBLE, anchoTotal));
    }

    private String ajustarAnchoValor(String valor, int anchoColumna) {
        if (estaEnBlanco(valor)) {
            return repetirString(" ", anchoColumna);
        }

        String valorLimpio = normalizarString(valor);
        if (valorLimpio.length() > anchoColumna) {
            valorLimpio = valorLimpio.substring(0, anchoColumna);

        }
        return valorLimpio + repetirString(" ", anchoColumna - valorLimpio.length());
    }

    @Override
    public List<T> getModelos() {
        return modelos;
    }

    @Override
    public void setModelos(List<T> modelos) {
        this.modelos = modelos;
    }

    public T getModeloSeleccionado() {
        return modeloSeleccionado;
    }

    @Override
    public boolean soloMostrarDatos() {
        return soloMostrarDatos;
    }

    @Override
    public void setSoloMostrarDatos(boolean soloMostrarDatos) {
        this.soloMostrarDatos = soloMostrarDatos;
    }
}
