package com.arturobarba.poo.modelo.persona;

import com.arturobarba.poo.modelo.Identificable;

/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Persona extends Identificable
{
    // instance variables - replace the example below with your own
    private String nombre;

    public Persona() {}

    public Persona(String nombre){
        super();
        setNombre(nombre);
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return "ID: " + getId() + " Nombre: " + getNombre();
    }
}
