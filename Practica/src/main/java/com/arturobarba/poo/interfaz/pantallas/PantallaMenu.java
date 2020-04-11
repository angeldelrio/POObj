package com.arturobarba.poo.interfaz.pantallas;

import com.arturobarba.poo.interfaz.Pantalla;
import com.arturobarba.poo.interfaz.pantallas.menus.Menu;

public abstract class PantallaMenu implements Pantalla {

    private final Menu menu;

    public PantallaMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void mostrar() {
        menu.mostrarMenu();
    }

    @Override
    public void salir() {
        menu.salirMenu();
    }
}
