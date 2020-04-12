package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Salida;

public class SeparadorElementoMenu extends ElementoMenu {

    public SeparadorElementoMenu() {
        super(-1, null, null);
    }

    @Override
    public String toString() {
        return Salida.SEPARADOR_FINO + System.lineSeparator();
    }
}
