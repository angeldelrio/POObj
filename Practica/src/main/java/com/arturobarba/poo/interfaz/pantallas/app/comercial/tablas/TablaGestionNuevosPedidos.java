package com.arturobarba.poo.interfaz.pantallas.app.comercial.tablas;

import com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido.tablas.TablaListadoPedido;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.pedido.Pedido;
import java.util.List;

public class TablaGestionNuevosPedidos extends TablaListadoPedido {

    @Override
    public List<AccionTabla<Pedido>> obtenerAcciones() {
        return super.obtenerAcciones();
    }
}
