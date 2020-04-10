package com.arturobarba.poo.interfaz.pantallas.tablas;

public abstract class AccionTabla<T> {
    private String caracterOpcion;
    private String descripcion;

    public AccionTabla(String caracterOpcion, String descripcion) {
        this.caracterOpcion = caracterOpcion;
        this.descripcion = descripcion;
    }

    public String getCaracterOpcion() {
        return caracterOpcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract void realizarAccion(T modelo);

    @Override
    public String toString() {
        return String.format("(%s) %s", getCaracterOpcion(), getDescripcion());
    }
}
