package com.arturobarba.poo.interfaz.pantallas.app.comercial;

import static com.arturobarba.poo.interfaz.Salida.println;
import static com.arturobarba.poo.interfaz.Salida.titulo;
import static com.arturobarba.poo.utils.StringUtils.estaEnBlanco;
import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.Pantalla;
import com.arturobarba.poo.interfaz.pantallas.app.comercial.tablas.TablaGestionNuevosPedidos;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.SalirAccionTabla;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.pedido.Pedido.EstadoPedido;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;

public class PantallaComercialGestionarNuevosPedidos implements Pantalla {
    private TablaGestionNuevosPedidos tablaGestionNuevosPedidos;

    public PantallaComercialGestionarNuevosPedidos() {
    }

    @Override
    public void mostrar() {
        titulo("Gestión de nuevos pedidos");

        String nifComercial;
        Comercial comercial = null;
        while(true) {
            println("Por favor, indique su NIF para identificarle como empleado o pulse 0 para cancelar:");
            nifComercial = Entrada.getString();

            if (estaEnBlanco(nifComercial)) {
                println("Debe especificar un NIF válido");
                continue;
            }

            if("0".equals(nifComercial)) {
                break;
            }

            comercial = Fabrica.MueblesArturo().empleados().buscarComercialPorNif(nifComercial);
            if (comercial != null) {
                break;
            }

            println("No se encontró ningún comercial con ese NIF");
        }

        if (comercial == null) {
            Interfaz.salirPantallaActual();
        }

        while(true) {
            tablaGestionNuevosPedidos = new TablaGestionNuevosPedidos(comercial);
            tablaGestionNuevosPedidos.setModelos(Fabrica.MueblesArturo().pedidos().buscarPedidosPorEstado(EstadoPedido.CREADO));
            AccionTabla<Pedido> accionRealizada = tablaGestionNuevosPedidos.mostrarTabla();

            if (accionRealizada instanceof SalirAccionTabla || tablaGestionNuevosPedidos.getModeloSeleccionado() == null) {
                break;
            }

            if (!Entrada.confirmar("¿Desea gestionar otro pedido?")) {
                break;
            }
        }

        Interfaz.salirPantallaActual();
    }

    @Override
    public void salir() {

    }
}
