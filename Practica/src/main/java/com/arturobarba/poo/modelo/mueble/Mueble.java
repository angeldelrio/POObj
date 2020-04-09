package com.arturobarba.poo.modelo.mueble;

import static com.arturobarba.poo.utils.StringUtils.estaEnBlanco;
import com.arturobarba.poo.modelo.Identificable;

/**
 * Abstract class Muebles - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Mueble extends Identificable
{
    public enum TipoMueble {
        MESA, SILLA;
    }

    private TipoMueble tipoMueble;
    private Float precio;
    private String modelo;

    public Mueble(TipoMueble tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public Float getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public TipoMueble getTipoMueble() {
        return tipoMueble;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        String salida = super.toString();

        salida += String.format(" %s ", getClass().getSimpleName());

        if(!estaEnBlanco(getModelo())) {
            salida += String.format(" Modelo: %s", getModelo());
        }

        if (getPrecio() != null) {
            salida += String.format(" Precio: %.2f €", getPrecio());
        }

        return salida;
    }
}
