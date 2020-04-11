package com.arturobarba.poo.interfaz.pantallas.app.cliente.menus;

import com.arturobarba.poo.interfaz.pantallas.app.cliente.PantallaEditarCliente;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteParticular;
import java.util.Arrays;
import java.util.List;

public class MenuTipoCliente extends AbstractMenu {
    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Seleccione tipo de cliente"),
            new ElementoMenu(1, "Particular", new AccionMenuNavegar(new PantallaEditarCliente(new ClienteParticular(), true))),
            new ElementoMenu(2, "Empresa", new AccionMenuNavegar(new PantallaEditarCliente(new ClienteEmpresa(), true))),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }
}
