package com.arturobarba.poo.modelo.mueble.mesa;

import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Write a description of class Mesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mesa extends Mueble
{
    public Mesa(double precio, Color color,
        TipoMadera tipoMadera) {
        super(precio, color, tipoMadera);
    }

    public String toString() {
        return "Mueble tipo mesa. "+super.toString();
    }
}
