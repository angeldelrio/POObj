package com.arturobarba.poo.interfaz.pantallas.app.empleado.tablas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;

public class AccionTablaEliminarEmpleado extends AccionTabla<Empleado> {

    public AccionTablaEliminarEmpleado() {
        super("b", "Borrar empleado");
    }

    @Override
    public void realizarAccion(Empleado empleado) {
        Fabrica.MueblesArturo().empleados().eliminar(empleado);
    }
}
