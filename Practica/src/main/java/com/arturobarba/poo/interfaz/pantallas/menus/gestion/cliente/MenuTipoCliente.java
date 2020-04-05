package com.arturobarba.poo.interfaz.pantallas.menus.gestion.cliente;

import com.arturobarba.poo.interfaz.pantallas.formularios.cliente.FormularioEditarCliente;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.modelo.persona.cliente.Empresa;
import com.arturobarba.poo.modelo.persona.cliente.Particular;
import java.util.Arrays;
import java.util.List;

public class MenuTipoCliente extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Seleccione tipo de cliente"),
            new ElementoMenu(1, "Particular", new AccionMenuNavegar(new FormularioEditarCliente(new Particular()))),
            new ElementoMenu(2, "Empresa", new AccionMenuNavegar(new FormularioEditarCliente(new Empresa()))),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }
}
