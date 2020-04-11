package com.arturobarba.poo.servicios;

import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import java.util.List;

public class ServicioGestionPedidos {
    private final Repositorio<Pedido> repositorioPedido;

    public ServicioGestionPedidos() {
        this.repositorioPedido = FactoriaRepositorios.repositorioPedidos();
    }

    public int guardar(Pedido pedido) {
        return repositorioPedido.guardar(pedido);
    }

    public List<Integer> guardar(List<Pedido> pedidos) {
        return repositorioPedido.guardar(pedidos);
    }

    public List<Pedido> listar() {
        return repositorioPedido.obtenerTodos();
    }

    public void eliminar(Pedido pedido) {
        eliminar(pedido.getId());
    }

    public void eliminar(int id) {
        repositorioPedido.eliminar(id);
    }

    public List<Pedido> buscarPedidosPendientesDeCliente(Cliente cliente) {
//        return repositorioPedido.buscar(new CriterioBusqueda<Pedido>() {
//            @Override
//            public boolean cumpleCriterio(Pedido pedido) {
//                return pedido.;
//            }
//        })

        return null;
    }
}
