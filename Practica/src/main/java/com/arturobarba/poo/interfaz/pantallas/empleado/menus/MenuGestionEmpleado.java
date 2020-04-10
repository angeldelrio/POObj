package com.arturobarba.poo.interfaz.pantallas.empleado.menus;

import com.arturobarba.poo.interfaz.pantallas.empleado.tablas.TablaEmpleados;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import java.util.Arrays;
import java.util.List;

public class MenuGestionEmpleado extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Gestión empleados"),
            new ElementoMenu(1, "Crear empleado", new AccionMenuNavegar(new MenuTipoEmpleado())),
            new ElementoMenu(2, "Listar empleados", new AccionMenuNavegar(new TablaEmpleados())),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }

}
