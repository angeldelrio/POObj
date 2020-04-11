package com.arturobarba.poo.interfaz.pantallas.app.empleado.menus;

import com.arturobarba.poo.interfaz.pantallas.app.empleado.PantallaEditarEmpleado;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import com.arturobarba.poo.modelo.persona.empleado.Jefe;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoHora;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoPlantilla;
import java.util.Arrays;
import java.util.List;

public class MenuTipoEmpleado extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {

        return Arrays.asList(
            new TituloElementoMenu("Seleccione tipo de empleado"),
            new ElementoMenu(1, "Jefe", new AccionMenuNavegar(new PantallaEditarEmpleado(new Jefe(), true))),
            new ElementoMenu(2, "Comercial", new AccionMenuNavegar(new PantallaEditarEmpleado(new Comercial(), true))),
            new ElementoMenu(3, "Artesano Plantilla", new AccionMenuNavegar(new PantallaEditarEmpleado(new ArtesanoPlantilla(), true))),
            new ElementoMenu(4, "Artesano Horas", new AccionMenuNavegar(new PantallaEditarEmpleado(new ArtesanoHora(), true))),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }
}
