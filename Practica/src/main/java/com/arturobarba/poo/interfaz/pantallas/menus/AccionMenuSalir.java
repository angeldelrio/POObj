package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Interfaz;

public class AccionMenuSalir implements AccionMenu {

    @Override
    public void realizarAccion(ElementoMenu elementoSeleccionado) {
        Interfaz.salirPantallaActual();
    }
}
