package com.arturobarba.poo.interfaz.pantallas.app.mueble;

import com.arturobarba.poo.interfaz.pantallas.PantallaMenu;
import com.arturobarba.poo.interfaz.pantallas.app.mueble.menus.MenuTipoMueble;

public class PantallaMenuTipoMueble extends PantallaMenu {
    public PantallaMenuTipoMueble() {
        super(new MenuTipoMueble());
    }
}
