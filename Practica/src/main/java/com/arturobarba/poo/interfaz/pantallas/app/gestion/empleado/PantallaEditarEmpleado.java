package com.arturobarba.poo.interfaz.pantallas.app.gestion.empleado;

import com.arturobarba.poo.interfaz.pantallas.PantallaFormulario;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.empleado.formularios.FormularioEditarEmpleado;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;

public class PantallaEditarEmpleado extends PantallaFormulario {
    public PantallaEditarEmpleado(Empleado empleadoEditado, boolean quiereAgregarVarios) {
        super(new FormularioEditarEmpleado(empleadoEditado, quiereAgregarVarios));
    }
}
