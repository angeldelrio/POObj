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
    private final List<Mueble> muebles;
    private Estado estado;

    /**
     * Constructor for objects of class Pedido
     */
    public Pedido()
    {
        muebles = new ArrayList <>();
        this.estado = Estado.PENDIENTE;
    }

    public double getImporte() {
        float total = 0;
        Iterator<Mueble> iter  = muebles.iterator();
        while (iter.hasNext()) { 
            total += iter.next().getPrecio();
        }
        return total;
    }
}
