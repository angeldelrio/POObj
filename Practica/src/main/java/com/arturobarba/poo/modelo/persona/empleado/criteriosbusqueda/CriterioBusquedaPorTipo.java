package com.arturobarba.poo.modelo.persona.empleado.criteriosbusqueda;

import com.arturobarba.poo.modelo.CriterioBusqueda;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;

public class CriterioBusquedaPorTipo implements CriterioBusqueda<Empleado> {

    private Class<? extends Empleado> tipo;

    public CriterioBusquedaPorTipo(Class<? extends Empleado> tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumpleCriterio(Empleado entidad) {
        if (entidad == null) {
            return false;
        }

        return entidad.getClass().equals(tipo);
    }
}
