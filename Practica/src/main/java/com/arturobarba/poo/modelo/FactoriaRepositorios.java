package com.arturobarba.poo.modelo;

import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.mueble.RepositorioMueble;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.pedido.RepositorioPedido;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.cliente.RepositorioCliente;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.RepositorioEmpleado;

public class FactoriaRepositorios {
    private static Repositorio<Empleado> repositorioEmpleado;
    private static Repositorio<Cliente> repositorioClientes;
    private static Repositorio<Mueble> repositorioMuebles;
    private static Repositorio<Pedido> repositorioPedidos;

    public static Repositorio<Empleado> repositorioEmpleados() {
        if (repositorioEmpleado == null) {
            repositorioEmpleado = new RepositorioEmpleado();
        }

        return repositorioEmpleado;
    }

    public static Repositorio<Cliente> repositorioClientes() {
        if (repositorioClientes == null) {
            repositorioClientes = new RepositorioCliente();
        }

        return repositorioClientes;
    }

    public static Repositorio<Mueble> repositorioMuebles() {
        if (repositorioMuebles == null) {
            repositorioMuebles = new RepositorioMueble();
        }

        return repositorioMuebles;
    }

    public static Repositorio<Pedido> repositorioPedidos() {
        if (repositorioPedidos == null) {
            repositorioPedidos = new RepositorioPedido();
        }

        return repositorioPedidos;
    }
}
