package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.menus;

import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.PantallaListadoCliente;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.PantallaMenuTipoCliente;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import java.util.Arrays;
import java.util.List;

public class MenuGestionCliente extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Gestión clientes"),
            new ElementoMenu(1, "Crear cliente", new AccionMenuNavegar(new PantallaMenuTipoCliente())),
            new ElementoMenu(2, "Listar clientes", new AccionMenuNavegar(new PantallaListadoCliente())),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }

}
