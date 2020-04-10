package com.arturobarba.poo.modelo.mueble.silla;

import com.arturobarba.poo.utils.StringUtils;

/**
 * Write a description of class SillaOficina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class SillaOficina extends Silla
{
    private boolean tieneRuedas;

    public SillaOficina(boolean tieneRuedas) {
        super(TipoSilla.SILLA_DE_OFICINA);
        this.tieneRuedas = tieneRuedas;
    }

    public boolean tieneRuedas() {
        return tieneRuedas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Tiene ruedas: %s", StringUtils.normalizarBoolean(tieneRuedas()));
    }
}
