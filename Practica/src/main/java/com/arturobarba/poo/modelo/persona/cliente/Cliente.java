package com.arturobarba.poo.modelo.persona.cliente;


import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.Persona;
import java.util.List;

/**
 * Abstract class Cliente - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Cliente extends Persona
{
    private String iban;
    private String telefono;
    private String nif;

    public Cliente() {}

    public Cliente(String nombre, String iban, String telefono, String nif) {
       super(nombre);
       this.iban = iban;
       this.telefono = telefono;
       this.nif = nif;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public List<Pedido> obtenerPedidosRealizados() {
        // TODO: return Fabrica.MueblesArturo()
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + " Tlf:" + telefono + ".";
    }
}
