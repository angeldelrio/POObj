package com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido.tablas.TablaListadoPedido;
import com.arturobarba.poo.modelo.pedido.Pedido;

public class PantallaListadoPedidos extends PantallaTabla<Pedido> {
    public PantallaListadoPedidos() {
       super(new TablaListadoPedido());
    }

    @Override
    public void mostrar() {
        getTabla().setModelos(Fabrica.MueblesArturo().pedidos().listar());
        getTabla().setSoloMostrarDatos(true);
        getTabla().mostrarTabla();

        Entrada.pulseCualquierTeclaParaContinuar();

        Interfaz.salirPantallaActual();
    }
}
