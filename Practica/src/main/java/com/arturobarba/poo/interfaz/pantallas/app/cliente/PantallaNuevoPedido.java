package com.arturobarba.poo.interfaz.pantallas.app.cliente;

import static com.arturobarba.poo.interfaz.Salida.println;
import static com.arturobarba.poo.interfaz.Salida.separadorGrande;
import static com.arturobarba.poo.interfaz.Salida.titulo;
import static com.arturobarba.poo.utils.StringUtils.estaEnBlanco;
import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.Pantalla;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.formularios.FormularioEditarCliente;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.menus.MenuTipoCliente;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.tablas.TablaSeleccionMuebles;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteParticular;
import java.util.List;

public class PantallaNuevoPedido implements Pantalla {

    @Override
    public void mostrar() {
        titulo("Nuevo pedido");

        String nif = null;
        while (estaEnBlanco(nif) && !"0".equals(nif)) {
            println("Por favor, introduzca su NIF para poder identificarle o pulse 0 para cancelar: ");
            nif = Entrada.getString();

            if (estaEnBlanco(nif)) {
                println("Por favor indique un NIF válido");
            }
        }

        if ("0".equals(nif)) {
            return;
        }

        Cliente cliente = Fabrica.MueblesArturo().clientes().buscarPorNif(nif);
        if (cliente == null) {
            println("No se encontró ningún cliente con ese NIF en nuestro sistema");
            println("Por favor, rellene sus datos");

            // Es un cliente nuevo
            MenuTipoCliente menuTipoCliente = new MenuTipoCliente();
            menuTipoCliente.debeIgnorarAcciones(true);
            menuTipoCliente.mostrarMenu();

            ElementoMenu elementoSeleccionado = menuTipoCliente.getElementoMenuSeleccionado();
            if (elementoSeleccionado == null) {
                // El cliente no seleccionó tipo
                println("No seleccionó un tipo de cliente, saliendo...");
                return;
            }

            FormularioEditarCliente formularioEditarCliente;
            if (elementoSeleccionado.getNumOpcion() == 1) {
                formularioEditarCliente = new FormularioEditarCliente(new ClienteParticular(), false);
            } else {
                formularioEditarCliente = new FormularioEditarCliente(new ClienteEmpresa(), false);
            }

            formularioEditarCliente.mostrarFormulario();
            formularioEditarCliente.guardarDatos();

            cliente = formularioEditarCliente.getClienteEditado();
        } else {
            println("Bienvenido de nuevo " + cliente.getNombre());
        }

        Pedido pedido = new Pedido(cliente);
        println("Por favor, seleccione los muebles que desea comprar: ");

        while (true) {
            List<Mueble> muebles = Fabrica.MueblesArturo().muebles().listar();
            TablaSeleccionMuebles tablaMuebles = new TablaSeleccionMuebles();
            tablaMuebles.setModelos(muebles);
            tablaMuebles.mostrarTabla();

            Mueble muebleSeleccionado = tablaMuebles.getModeloSeleccionado();
            if(muebleSeleccionado == null) {
                break;
            }

            pedido.agregarMueble(muebleSeleccionado);

            boolean deseaAgregarOtro = Entrada.confirmar("¿Desea agregar otro mueble al pedido?");
            if (!deseaAgregarOtro) {
                break;
            }
        }

        if (pedido.getMuebles().isEmpty()) {
            println("No puede crear un pedido sin muebles");
            return;
        }

        Fabrica.MueblesArturo().pedidos().guardar(pedido);

        separadorGrande();
        println(String.format("Pedido creado correctamente. El ID de su pedido es %s", pedido.getId()));
        println("Uno de nuestros comerciales atenderá su pedido tan pronto como sea posible");

        Entrada.pulseCualquierTeclaParaContinuar();

        Interfaz.salirPantallaActual();
    }

    @Override
    public void salir() {

    }
}
