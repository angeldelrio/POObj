package com.arturobarba.poo.interfaz.pantallas.tablas;

import java.util.List;

public abstract class Fila<T> {
    private List<String> valores;

    public Fila(T modelo) {
        valores = extraerValores(modelo);
    }

    public abstract List<String> extraerValores(T modelo);

    public List<String> getValores() {
        return valores;
    }
}
