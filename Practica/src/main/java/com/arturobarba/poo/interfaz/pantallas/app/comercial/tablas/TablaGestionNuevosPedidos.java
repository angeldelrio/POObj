package com.arturobarba.poo.interfaz.pantallas.app.comercial.tablas;

import com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido.tablas.TablaListadoPedido;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.SalirAccionTabla;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import java.util.ArrayList;
import java.util.List;

public class TablaGestionNuevosPedidos extends TablaListadoPedido {

    private final Comercial comercial;

    public TablaGestionNuevosPedidos(Comercial comercial) {
        this.comercial = comercial;
    }

    @Override
    public List<AccionTabla<Pedido>> obtenerAcciones() {
        List<AccionTabla<Pedido>> acciones = new ArrayList<>();
        acciones.add(new AccionTablaPresupuestarPedido(comercial));
        acciones.add(new SalirAccionTabla<Pedido>());
        return acciones;
    }
}
