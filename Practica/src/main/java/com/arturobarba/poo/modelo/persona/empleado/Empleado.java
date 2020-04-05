package com.arturobarba.poo.modelo.persona.empleado;

import com.arturobarba.poo.modelo.persona.Persona;

/**
 * Abstract class Empleado - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Empleado extends Persona
{
    private Integer horasContrato;
    private Integer salario;

    public Empleado() {}

    public Empleado(String nombre) {
       super(nombre);

    }

    public Integer getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(Integer horasContrato) {
        this.horasContrato = horasContrato;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String toString() {
        return super.toString() + "Horas Contrato: " + getHorasContrato() + ". Salario: " + getSalario();
    }
}
