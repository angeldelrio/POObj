package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente;

import com.arturobarba.poo.interfaz.pantallas.PantallaMenu;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.menus.MenuGestionCliente;

public class PantallaMenuGestionCliente extends PantallaMenu {
    public PantallaMenuGestionCliente() {
        super(new MenuGestionCliente());
    }
}
