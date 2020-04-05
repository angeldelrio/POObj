package com.arturobarba.poo.modelo.pedido;

import com.arturobarba.poo.modelo.Identificable;
import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido extends Identificable
{
    // instance variables - replace the example below with your own
    private Cliente cliente;
    private Comercial comercial;
    private ArrayList<Mueble> muebles;
    private Estado estado;

    /**
     * Constructor for objects of class Pedido
     */
    public Pedido(List<Mueble> muebles, Cliente cliente)
    {
        muebles = new ArrayList <>(muebles);
        this.estado = Estado.PENDIENTE;
        this.cliente = cliente;
    }

    public double getPrecio() {
        double total = 0;
        Iterator<Mueble> iter  = muebles.iterator();
        Mueble mueble;
        while (iter.hasNext()) { 
            total += iter.next().getPrecio();
        }
        return total;
    }
}
