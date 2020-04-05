package com.arturobarba.poo.modelo.mueble.silla;

import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Write a description of class SillaOficina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class SillaOficina extends Silla
{
    public SillaOficina(double precio, Color color,
        TipoMadera tipoMadera) {
        super(precio, color, tipoMadera);
    }

    public String toString() {
        return super.toString()+ "Silla destinada para oficinas.";
    }
}
