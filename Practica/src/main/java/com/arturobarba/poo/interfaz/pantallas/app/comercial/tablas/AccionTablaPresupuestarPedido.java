package com.arturobarba.poo.interfaz.pantallas.app.comercial.tablas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;

public class AccionTablaPresupuestarPedido extends AccionTabla<Pedido> {

    private final Comercial comercial;

    public AccionTablaPresupuestarPedido(Comercial comercial) {
        super("p", "Presupuestar pedido");
        this.comercial = comercial;
    }

    @Override
    public void realizarAccion(Pedido pedido) {
        Fabrica.MueblesArturo().pedidos().presupuestarPedido(pedido, comercial);
    }
}
