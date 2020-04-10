package com.arturobarba.poo.interfaz.pantallas.empleado.tablas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.pantallas.empleado.formularios.FormularioEditarEmpleado;
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
