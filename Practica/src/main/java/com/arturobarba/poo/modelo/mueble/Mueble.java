package com.arturobarba.poo.modelo.mueble;

import com.arturobarba.poo.modelo.Identificable;
import com.arturobarba.poo.modelo.mueble.caracteristicas.Color;
import com.arturobarba.poo.modelo.mueble.caracteristicas.TipoMadera;

/**
 * Abstract class Muebles - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Mueble extends Identificable
{
    private Color color;
    private TipoMadera tipoMadera;
    private double precio;

    public Mueble(double precio, Color color, TipoMadera tipoMadera) {
        setPrecio(precio);
        setColor(color);
        setTipoMadera(tipoMadera);
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        if (precio > 0)
            this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TipoMadera getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(TipoMadera tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "#" + getId() + ". Precio: " + getPrecio() + " euros.";
    }
}
