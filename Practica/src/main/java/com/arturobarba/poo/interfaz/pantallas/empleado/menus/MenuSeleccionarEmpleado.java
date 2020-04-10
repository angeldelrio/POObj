package com.arturobarba.poo.interfaz.pantallas.empleado.menus;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.empleado.formularios.FormularioEditarEmpleado;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import java.util.ArrayList;
import java.util.List;

public class MenuSeleccionarEmpleado extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        List<ElementoMenu> elementos = new ArrayList<>();
        elementos.add(new TituloElementoMenu("Seleccione un empleado a editar"));

        List<Empleado> empleados = Fabrica.MueblesArturo().empleados().listar();
        for (Empleado empleado : empleados) {
            elementos.add(new ElementoMenu(empleado.getId(), empleado.toString(), new AccionMenuNavegar(new FormularioEditarEmpleado(empleado, false))));
        }

        elementos.add(new SeparadorElementoMenu());
        elementos.add(new SalirElementoMenu());

        return elementos;
    }
}
