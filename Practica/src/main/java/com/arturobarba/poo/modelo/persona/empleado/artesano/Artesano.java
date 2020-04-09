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
    public enum TipoArtesano {
        ARTESANO_EN_PLANTILLA, ARTESANO_POR_HORAS;
    }

    private Pedido pedidoAsignado;
    private TipoArtesano tipoArtesano;

    public Artesano(TipoArtesano tipoArtesano) {
        super(TipoEmpleado.ARTESANO);
        this.tipoArtesano = tipoArtesano;
    }

    public TipoArtesano getTipoArtesano() {
        return tipoArtesano;
    }

    public void setTipoArtesano(TipoArtesano tipoArtesano) {
        this.tipoArtesano = tipoArtesano;
    }

    public Pedido getPedidoAsignado() {
        return pedidoAsignado;
    }

    public void setPedidoAsignado(Pedido pedidoAsignado) {
        this.pedidoAsignado = pedidoAsignado;
    }

    public boolean tienePedidoAsignado() {
        return getPedidoAsignado() != null;
    }

    @Override
    public String toString() {
        return super.toString() + " Pedido asignado: " + (tienePedidoAsignado() ? getPedidoAsignado().getId() : "Ninguno");
    }
}
