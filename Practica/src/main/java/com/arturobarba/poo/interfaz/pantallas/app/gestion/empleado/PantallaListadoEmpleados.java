package com.arturobarba.poo.interfaz.pantallas.app.gestion.empleado;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.empleado.tablas.TablaEmpleados;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;

public class PantallaListadoEmpleados extends PantallaTabla<Empleado> {

    public PantallaListadoEmpleados() {
        super(new TablaEmpleados());
    }

    @Override
    public void mostrar() {
        getTabla().setModelos(Fabrica.MueblesArturo().empleados().listar());
        getTabla().mostrarTabla();
    }
}
