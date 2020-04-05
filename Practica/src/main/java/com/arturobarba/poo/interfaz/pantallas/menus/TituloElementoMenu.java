package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Salida;

public class TituloElementoMenu extends ElementoMenu {
    public TituloElementoMenu(String titulo) {
        super(-1, titulo, null);
    }

    @Override
    public String toString() {
        return getEnunciado().toUpperCase() + System.lineSeparator()
            + Salida.SEPARADOR_GRANDE;
    }
}
