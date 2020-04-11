package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Pantalla;
import java.util.List;

public interface Menu {
    List<ElementoMenu> obtenerElementosMenu();
    ElementoMenu seleccionarElementoMenu();
    ElementoMenu buscarElementoMenu(int numOpcion);
    ElementoMenu getElementoMenuSeleccionado();
    void mostrarMenu();
    void salirMenu();
}
