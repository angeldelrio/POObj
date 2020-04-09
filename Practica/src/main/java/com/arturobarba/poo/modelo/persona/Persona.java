package com.arturobarba.poo.modelo.persona;

import com.arturobarba.poo.modelo.Identificable;
import com.arturobarba.poo.modelo.Representable;
import static com.arturobarba.poo.utils.StringUtils.*;

/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Persona extends Identificable implements Representable
{
    public enum TipoPersona {
        CLIENTE, EMPLEADO;

        @Override
        public String toString() {
            return normalizarEnum(this);
        }
    }

    private String nombre;
    private String nif;
    private TipoPersona tipoPersona;

    public Persona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    @Override
    public String toString() {
        String salida = super.toString() + " " + getClass().getSimpleName();

        if (!estaEnBlanco(getNif())) {
            salida += String.format(" Nif: %s", getNif());
        }

        if (!estaEnBlanco(getNombre())) {
            salida += String.format(" Nombre: %s", getNombre());
        }

        return salida;
    }
}
