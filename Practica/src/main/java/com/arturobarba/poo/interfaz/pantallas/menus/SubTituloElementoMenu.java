package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Salida;

public class SubTituloElementoMenu extends ElementoMenu {
    public SubTituloElementoMenu(String titulo) {
        super(-1, titulo, null);
    }

    @Override
    public String toString() {
        return getEnunciado().toUpperCase() + System.lineSeparator()
            + Salida.SEPARADOR_FINO;
    }
}
