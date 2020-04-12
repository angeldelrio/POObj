package com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido.tablas;

import com.arturobarba.poo.interfaz.pantallas.tablas.AbstractTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.Columna;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.modelo.pedido.Pedido;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TablaListadoPedido extends AbstractTabla<Pedido> {

    @Override
    public List<Columna> obtenerColumnas() {
        return Arrays.asList(
            new Columna("#ID", 4),
            new Columna("Estado", 8),
            new Columna("Cliente", 30),
            new Columna("Comercial", 30),
            new Columna("nº muebles", 10),
            new Columna("Importe", 8),
            new Columna("Imp. IVA", 8),
            new Columna("Imp. Total", 8)
        );
    }

    @Override
    public Fila<Pedido> convertirAFila(Pedido pedido) {
        return new FilaPedido(pedido);
    }

    @Override
    public List<AccionTabla<Pedido>> obtenerAcciones() {
        return Collections.emptyList();
    }


}
