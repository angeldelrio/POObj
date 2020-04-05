package com.arturobarba.poo.modelo.mueble.mesa;

import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Write a description of class MesaDeComedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MesaDeComedor extends Mesa
{

    public MesaDeComedor(double precio, Color color,
        TipoMadera tipoMadera) {
        super(precio, color, tipoMadera);
    }

    public String toString() {
        return super.toString() + " Mesa de comedor.";
    }
}
