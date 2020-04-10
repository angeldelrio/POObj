package com.arturobarba.poo.interfaz.pantallas.tablas;

public class Columna {
    private String nombre;
    private int ancho;

    public Columna() {}

    public Columna(String nombre, int ancho) {
        this.nombre = nombre;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
