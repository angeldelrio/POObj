package com.arturobarba.poo.modelo.persona.cliente;


import com.arturobarba.poo.modelo.persona.Persona;
import com.arturobarba.poo.utils.StringUtils;

/**
 * Abstract class Cliente - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Cliente extends Persona
{
    public enum TipoCliente {
        PARTICULAR, EMPRESA;
    }

    private String iban;
    private TipoCliente tipoCliente;

    public Cliente(TipoCliente tipoCliente) {
        super(TipoPersona.CLIENTE);
        this.tipoCliente = tipoCliente;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String toString() {
        String salida = super.toString();

        if (!StringUtils.estaEnBlanco(getIban())) {
            salida += String.format(" IBAN: %s", getIban());
        }

        return salida;
    }
}
