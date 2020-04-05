package com.arturobarba.poo.modelo.persona.cliente;

/**
 * Write a description of class Particular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Particular extends Cliente
{

    public Particular() {}

    public Particular(String nombre, String iban, String telefono, String nif) {
       super(nombre, iban, telefono, nif);
    }

    @Override
    public String toString() {
        return "(Particular) " + super.toString();
    }
}
