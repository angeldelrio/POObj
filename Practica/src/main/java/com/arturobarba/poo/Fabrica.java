package com.arturobarba.poo;

import com.arturobarba.poo.servicios.ServicioGestionClientes;
import com.arturobarba.poo.servicios.ServicioGestionEmpleados;
import com.arturobarba.poo.servicios.ServicioGestionMuebles;
import com.arturobarba.poo.servicios.ServicioGestionPedidos;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fabrica
{
    private static Fabrica instancia;

    // instance variables - replace the example below with your own
    private ServicioGestionEmpleados servicioEmpleados;
    private ServicioGestionClientes servicioClientes;
    private ServicioGestionMuebles servicioMuebles;
    private ServicioGestionPedidos servicioPedidos;

    /**
     * Constructor for objects of class Main
     */
    private Fabrica() {
        servicioEmpleados = new ServicioGestionEmpleados();
        servicioClientes = new ServicioGestionClientes();
        servicioMuebles = new ServicioGestionMuebles();
        servicioPedidos = new ServicioGestionPedidos();
    }

    public ServicioGestionClientes clientes() {
        return servicioClientes;
    }

    public ServicioGestionEmpleados empleados() {
        return servicioEmpleados;
    }

    public ServicioGestionMuebles muebles() {
        return servicioMuebles;
    }

    public ServicioGestionPedidos pedidos() {
        return servicioPedidos;
    }

    public static Fabrica MueblesArturo() {
        if (instancia == null) {
            instancia = new Fabrica();
        }

        return instancia;
    }

}
