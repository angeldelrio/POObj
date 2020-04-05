package com.arturobarba.poo.modelo.persona.empleado.artesano;


import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import java.util.*;

/**
 * Abstract class Artesano - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Artesano extends Empleado
{
    private Pedido pedidoAsignado;

    public Pedido getPedidoAsignado() {
        return pedidoAsignado;
    }

    public void setPedidoAsignado(Pedido pedidoAsignado) {
        this.pedidoAsignado = pedidoAsignado;
    }
}
