package com.arturobarba.poo.modelo.persona.empleado.artesano;

/**
 * Write a description of class ArtesanoHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArtesanoHora extends Artesano
{
    private Integer horasContrato;

    public ArtesanoHora() {}

    public Integer getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(Integer horasContrato) {
        this.horasContrato = horasContrato;
    }

    public String toString() {
        return "(Artesano por horas)" + super.toString();
    }
}
