package com.arturobarba.poo.servicios;

import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.pedido.Pedido;

public class ServicioGestionPedidos {
    private final Repositorio<Pedido> repositorioPedido;

    public ServicioGestionPedidos() {
        this.repositorioPedido = FactoriaRepositorios.repositorioPedidos();
    }
}
