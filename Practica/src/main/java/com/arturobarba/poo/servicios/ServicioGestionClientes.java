package com.arturobarba.poo.servicios;

import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import java.util.List;

public class ServicioGestionClientes {
    private Repositorio<Cliente> repositorioCliente;

    public ServicioGestionClientes() {
        this.repositorioCliente = FactoriaRepositorios.repositorioClientes();
    }

    public int guardar(Cliente cliente) {
        return repositorioCliente.guardar(cliente);
    }

    public List<Integer> guardar(List<Cliente> clientes) {
        return repositorioCliente.guardar(clientes);
    }

    public List<Cliente> listar() {
        return repositorioCliente.obtenerTodos();
    }

    public void eliminar(Cliente cliente) {
        eliminar(cliente.getId());
    }

    public void eliminar(int id) {
        repositorioCliente.eliminar(id);
    }
}
