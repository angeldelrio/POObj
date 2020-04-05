package com.arturobarba.poo.modelo.persona.cliente;

/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empresa extends Cliente
{

    public Empresa() { }

    @Override
    public String toString() {
        return "(Empresa) " + super.toString();
    }
}
