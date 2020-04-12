package com.arturobarba.poo.interfaz.pantallas.tablas;

import com.arturobarba.poo.modelo.Identificable;
import java.util.List;

public interface Tabla<T extends Identificable> {
    List<Columna> obtenerColumnas();

    Fila<T> convertirAFila(T modelo);
    List<Fila<T>> obtenerFilas(List<T> modelos);

    List<AccionTabla<T>> obtenerAcciones();

    AccionTabla<T> seleccionarAccion(T modeloSeleccionado);

    T seleccionarModelo();

    AccionTabla<T> mostrarTabla();

    List<T> getModelos();

    void setModelos(List<T> modelos);

    void setSoloMostrarDatos(boolean soloMostrarDatos);
    boolean soloMostrarDatos();

}
