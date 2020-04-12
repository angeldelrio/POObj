package com.arturobarba.poo.modelo.pedido;

import com.arturobarba.poo.modelo.Identificable;
import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido extends Identificable
{
    public final static int PORCENTAJE_IVA = 21;

    public enum EstadoPedido
    {
        CREADO, PDTE_ACEPTAR_PRESUPUESTO, PRESUPUESTO_ACEPTADO, PRESUPUESTO_RECHAZADO, PDTE_FABRICACION, EN_FABRICACION, PDTE_RECOGIDA, FINALIZADO, INCIDENCIA;
    }
    // instance variables - replace the example below with your own
    private Cliente cliente;
    private Comercial comercial;
    private final List<Mueble> muebles;
    private EstadoPedido estado;
    private Float importe;
    private Float importeIva;

    /**
     * Constructor for objects of class Pedido
     */
    public Pedido(Cliente cliente)
    {
        muebles = new ArrayList <>();
        this.cliente = cliente;
        this.estado = EstadoPedido.CREADO;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }

    public Float getImporteIva() {
        return importeIva;
    }

    public void setImporteIva(Float importeIva) {
        this.importeIva = importeIva;
    }

    public void agregarMueble(Mueble mueble) {
        muebles.add(mueble);
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Mueble> getMuebles() {
        return muebles;
    }
}
