package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble;

import com.arturobarba.poo.interfaz.pantallas.PantallaMenu;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.menus.MenuGestionMueble;

public class PantallaMenuGestionMueble extends PantallaMenu {
    public PantallaMenuGestionMueble() {
        super(new MenuGestionMueble());
    }
}
