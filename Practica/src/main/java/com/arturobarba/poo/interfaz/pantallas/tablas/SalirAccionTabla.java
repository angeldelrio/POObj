package com.arturobarba.poo.interfaz.pantallas.tablas;

import com.arturobarba.poo.interfaz.Interfaz;

public class SalirAccionTabla<T> extends AccionTabla<T> {

    public SalirAccionTabla() {
        super("s", "Salir");
    }

    @Override
    public void realizarAccion(T modelo) {
        Interfaz.salirPantallaActual();
    }
}
