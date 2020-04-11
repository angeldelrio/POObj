package com.arturobarba.poo.interfaz.pantallas.app.mueble;

import com.arturobarba.poo.interfaz.pantallas.PantallaMenu;
import com.arturobarba.poo.interfaz.pantallas.app.cliente.menus.MenuGestionCliente;
import com.arturobarba.poo.interfaz.pantallas.app.mueble.menus.MenuGestionMueble;

public class PantallaMenuGestionMueble extends PantallaMenu {
    public PantallaMenuGestionMueble() {
        super(new MenuGestionMueble());
    }
}
