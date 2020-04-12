//package com.arturobarba.poo.interfaz.pantallas.app.comercial;
//
//import com.arturobarba.poo.Fabrica;
//import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
//import com.arturobarba.poo.interfaz.pantallas.tablas.Tabla;
//import com.arturobarba.poo.modelo.pedido.Pedido;
//import com.arturobarba.poo.modelo.pedido.Pedido.EstadoPedido;
//import com.arturobarba.poo.modelo.persona.empleado.Comercial;
//
//public class PantallaComercialGestionarNuevosPedidos extends PantallaTabla<Pedido> {
//
//    private Comercial comercial;
//
//    public PantallaComercialGestionarNuevosPedidos(Comercial comercial) {
//        super(tabla, Fabrica.MueblesArturo().pedidos().buscarPedidosPorEstado(EstadoPedido.CREADO));
//        this.comercial = comercial;
//    }
//
//    @Override
//    public void mostrar() {
//        super.mostrar();
//    }
//}
