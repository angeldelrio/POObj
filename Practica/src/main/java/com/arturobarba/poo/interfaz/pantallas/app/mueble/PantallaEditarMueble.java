package com.arturobarba.poo.interfaz.pantallas.app.mueble;

import com.arturobarba.poo.interfaz.pantallas.PantallaFormulario;
import com.arturobarba.poo.interfaz.pantallas.app.empleado.formularios.FormularioEditarEmpleado;
import com.arturobarba.poo.interfaz.pantallas.app.mueble.formularios.FormularioEditarMueble;
import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;

public class PantallaEditarMueble extends PantallaFormulario {
    public PantallaEditarMueble(Mueble muebleEditado, boolean quiereAgregarVarios) {
        super(new FormularioEditarMueble(muebleEditado, quiereAgregarVarios));
    }
}
