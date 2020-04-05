package com.arturobarba.poo.interfaz.pantallas.menus.gestion.empleado;

import com.arturobarba.poo.interfaz.pantallas.formularios.empleado.FormularioEditarEmpleado;
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
            new ElementoMenu(1, "Jefe", new AccionMenuNavegar(new FormularioEditarEmpleado(new Jefe()))),
            new ElementoMenu(2, "Comercial", new AccionMenuNavegar(new FormularioEditarEmpleado(new Comercial()))),
            new ElementoMenu(3, "Artesano Plantilla", new AccionMenuNavegar(new FormularioEditarEmpleado(new ArtesanoPlantilla()))),
            new ElementoMenu(4, "Artesano Horas", new AccionMenuNavegar(new FormularioEditarEmpleado(new ArtesanoHora()))),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }
}
