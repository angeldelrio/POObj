package com.arturobarba.poo.modelo.mueble.mesa;

import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Write a description of class MesaCafeCristal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MesaCafeCristal extends MesaDeCafe
{
    public MesaCafeCristal(double precio, Color color,
        TipoMadera tipoMadera) {
        super(precio, color, tipoMadera);
    }

    public String toString() {
        return super.toString() + " Fabricada con cristal.";
    }
}
