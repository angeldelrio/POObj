package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.Pantalla;

public class AccionMenuNavegar implements AccionMenu {

    private final Pantalla pantallaDestino;

    public AccionMenuNavegar(Pantalla pantallaDestino) {
        this.pantallaDestino = pantallaDestino;
    }

    @Override
    public void realizarAccion(ElementoMenu elementoSeleccionado) {
        Interfaz.navegarAPantalla(pantallaDestino);
    }
}
