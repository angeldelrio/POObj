package com.arturobarba.poo.modelo.mueble.mesa;

import com.arturobarba.poo.modelo.mueble.Mueble;

/**
 * Write a description of class Mesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mesa extends Mueble
{
    public enum TipoMesa {
        MESA_DE_CAFE, MESA_DE_DORMITORIO, MESA_DE_COMEDOR;
    }

    private TipoMesa tipoMesa;

    public Mesa(TipoMesa tipoMesa, Material material) {
        super(TipoMueble.MESA, material);
        this.tipoMesa = tipoMesa;
    }

    public TipoMesa getTipoMesa() {
        return tipoMesa;
    }
}
