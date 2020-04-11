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

    private final TipoSilla tipoSilla;
    private final boolean esPlegable;
    private final boolean tieneRuedas;

    public Silla(TipoSilla tipoSilla, boolean esPlegable, boolean tieneRuedas) {
        super(TipoMueble.SILLA, Material.MADERA);
        this.tipoSilla = tipoSilla;
        this.esPlegable = esPlegable;
        this.tieneRuedas = tieneRuedas;
    }

    public TipoSilla getTipoSilla() {
        return tipoSilla;
    }

    public boolean esPlegable() {
        return esPlegable;
    }

    public boolean tieneRuedas() {
        return tieneRuedas;
    }
}
