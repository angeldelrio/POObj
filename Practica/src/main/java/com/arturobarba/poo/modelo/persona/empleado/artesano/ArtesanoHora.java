package com.arturobarba.poo.modelo.persona.empleado.artesano;

/**
 * Write a description of class ArtesanoHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArtesanoHora extends Artesano
{
    private Integer horasDeTrabajo;

    public ArtesanoHora() {
        super(TipoArtesano.ARTESANO_POR_HORAS);
    }

    public Integer getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    @Override
    public String toString() {
        String salida = super.toString();

        if (horasDeTrabajo != null) {
            salida += String.format(" Horas de trabajo: %s", getHorasDeTrabajo());
        }

        return salida;
    }
}
