package com.arturobarba.poo.interfaz.pantallas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Pantalla;
import com.arturobarba.poo.interfaz.pantallas.tablas.Tabla;
import com.arturobarba.poo.modelo.Identificable;
import java.util.List;

public class PantallaTabla<T extends Identificable> implements Pantalla {
    private final Tabla<T> tabla;

    public PantallaTabla(Tabla<T> tabla) {
        this.tabla = tabla;
    }

    public PantallaTabla(Tabla<T> tabla, List<T> modelos) {
        this.tabla = tabla;
        tabla.setModelos(modelos);
    }


    @Override
    public void mostrar() {
        tabla.mostrarTabla();
    }

    @Override
    public void salir() {

    }

    public Tabla<T> getTabla() {
        return tabla;
    }
}
