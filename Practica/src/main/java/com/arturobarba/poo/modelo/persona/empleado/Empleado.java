package com.arturobarba.poo.modelo.persona.empleado;

import com.arturobarba.poo.modelo.persona.Persona;
import com.arturobarba.poo.utils.StringUtils;

/**
 * Abstract class Empleado - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Empleado extends Persona
{
    public enum TipoEmpleado {
        JEFE, COMERCIAL, ARTESANO;

        @Override
        public String toString() {
            return StringUtils.normalizarEnum(this);
        }
    }

    private Integer salario;
    private TipoEmpleado tipoEmpleado;

    public Empleado(TipoEmpleado tipoEmpleado) {
        super(TipoPersona.EMPLEADO);
        this.tipoEmpleado = tipoEmpleado;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    @Override
    public String toString() {
        String salida = super.toString();

        if (getSalario() != null) {
            salida += String.format(" Salario: %s€", getSalario());
        }

        return salida;
    }
}
