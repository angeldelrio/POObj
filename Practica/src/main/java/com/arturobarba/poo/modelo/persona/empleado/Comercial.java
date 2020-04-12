package com.arturobarba.poo.modelo.persona.empleado;

import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.pedido.Pedido.EstadoPedido;
import com.arturobarba.poo.modelo.persona.cliente.Cliente.TipoCliente;

/**
 * Write a description of class Comercial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercial extends Empleado
{

    public Comercial() {
        super(TipoEmpleado.COMERCIAL);
    }

    public void presupuestaPedido(Pedido pedido) {
        pedido.setComercial(this);
        pedido.setImporte(calcularImporte(pedido));

        if (pedido.getCliente().getTipoCliente() == TipoCliente.PARTICULAR) {
            pedido.setImporteIva(calcularIva(pedido.getImporte()));
        }

        pedido.setEstado(EstadoPedido.PDTE_ACEPTAR_PRESUPUESTO);
    }

    private float calcularImporte(Pedido pedido) {
        float importe = 0;

        for(Mueble mueble : pedido.getMuebles()) {
            importe += mueble.getPrecio();
        }

        return importe;
    }

    private float calcularIva(float importe) {
        return (importe * Pedido.PORCENTAJE_IVA) / 100;
    }
}
