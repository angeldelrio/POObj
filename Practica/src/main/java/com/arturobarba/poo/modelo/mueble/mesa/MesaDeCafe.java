package com.arturobarba.poo.modelo.mueble.mesa;

/**
 * Write a description of class MesaDeCafe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MesaDeCafe extends Mesa
{
    public MesaDeCafe(Material material) {
        super(TipoMesa.MESA_DE_CAFE, material);
    }

}
