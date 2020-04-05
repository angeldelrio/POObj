package com.arturobarba.poo.modelo.mueble.silla;

import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Write a description of class SillaSinRuedas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SillaSinRuedas extends SillaOficina
{
    public SillaSinRuedas(double precio, Color color,
        TipoMadera tipoMadera) {
        super(precio, color, tipoMadera);
    }

    public String toString() {
        return super.toString()+ "No incorpora ruedas.";
    }
}
