package com.arturobarba.poo.modelo.persona.cliente;

import com.arturobarba.poo.utils.StringUtils;

/**
 * Write a description of class Empresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empresa extends Cliente
{
    public enum TipoEmpresa {
        MINORISTA, MAYORISTA;

        @Override
        public String toString() {
            return StringUtils.normalizarEnum(this);
        }
    }

    private TipoEmpresa tipoEmpresa;

    public Empresa() {
        super(TipoCliente.EMPRESA);
    }

    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Tipo de Empresa: %s", tipoEmpresa.toString());
    }
}
