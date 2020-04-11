package com.arturobarba.poo.interfaz.pantallas.app.cliente;

import com.arturobarba.poo.interfaz.pantallas.PantallaMenu;
import com.arturobarba.poo.interfaz.pantallas.app.cliente.menus.MenuGestionCliente;

public class PantallaMenuGestionCliente extends PantallaMenu {
    public PantallaMenuGestionCliente() {
        super(new MenuGestionCliente());
    }
}
