package com.arturobarba.poo.modelo.mueble.silla;

import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Write a description of class Silla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Silla extends Mueble
{

    public Silla(double precio, Color color,
        TipoMadera tipoMadera) {
        super(precio, color, tipoMadera);
    }

    public String toString() {
        return "Mueble tipo silla. "+ super.toString();
    }
}
