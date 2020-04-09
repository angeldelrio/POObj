package com.arturobarba.poo.modelo.mueble.silla;

import com.arturobarba.poo.modelo.mueble.Mueble;

/**
 * Write a description of class Silla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Silla extends Mueble
{
    public enum TipoSilla {
        SILLA_DE_COCINA, SILLA_DE_OFICINA, SILLA_PLEGABLE;
    }

    private TipoSilla tipoSilla;

    public Silla(TipoSilla tipoSilla) {
        super(TipoMueble.SILLA);
        this.tipoSilla = tipoSilla;
    }

    public TipoSilla getTipoSilla() {
        return tipoSilla;
    }

}
