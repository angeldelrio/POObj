package com.arturobarba.poo.interfaz.pantallas.empleado.tablas;

import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.pantallas.empleado.formularios.FormularioEditarEmpleado;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;

public class AccionTablaEditarEmpleado extends AccionTabla<Empleado> {

    public AccionTablaEditarEmpleado() {
        super("e", "Editar empleado");
    }

    @Override
    public void realizarAccion(Empleado empleado) {
        Interfaz.navegarAPantalla(new FormularioEditarEmpleado(empleado, false));
    }
}
