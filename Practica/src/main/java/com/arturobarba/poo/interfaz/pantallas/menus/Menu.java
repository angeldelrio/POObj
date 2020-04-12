package com.arturobarba.poo.interfaz.pantallas.menus;

import java.util.List;

public interface Menu {
    List<ElementoMenu> obtenerElementosMenu();
    ElementoMenu buscarElementoMenu(int numOpcion);
    ElementoMenu getElementoMenuSeleccionado();
    void debeIgnorarAcciones(boolean debeIgnorarAcciones);
    boolean debeIgnorarAcciones();
    void mostrarMenu();
    void salirMenu();
}
