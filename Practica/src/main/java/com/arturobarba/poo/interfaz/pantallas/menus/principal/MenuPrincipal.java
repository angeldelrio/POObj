package com.arturobarba.poo.interfaz.pantallas.menus.principal;

import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.gestion.cliente.MenuGestionCliente;
import com.arturobarba.poo.interfaz.pantallas.menus.gestion.empleado.MenuGestionEmpleado;
import java.util.Arrays;
import java.util.List;

public class MenuPrincipal extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Menu principal"),
            new ElementoMenu(1, "Acciones de jefes", new AccionMenuNavegar(null)),
            new ElementoMenu(2, "Acciones de comercial", new AccionMenuNavegar(null)),
            new ElementoMenu(3, "Acciones de artesano", new AccionMenuNavegar(null)),
            new SeparadorElementoMenu(),
            new ElementoMenu(4, "Gestión de clientes", new AccionMenuNavegar(new MenuGestionCliente())),
            new ElementoMenu(5, "Gestión de empleados", new AccionMenuNavegar(new MenuGestionEmpleado())),
            new SalirElementoMenu()
        );
    }

}
