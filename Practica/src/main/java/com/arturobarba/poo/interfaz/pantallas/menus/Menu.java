package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Pantalla;
import java.util.List;

public interface Menu extends Pantalla {
    List<ElementoMenu> obtenerElementosMenu();
    ElementoMenu seleccionarElementoMenu();
    ElementoMenu obtenerElementoMenu(int numOpcion);
}
