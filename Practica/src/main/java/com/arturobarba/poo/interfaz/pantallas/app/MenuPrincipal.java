package com.arturobarba.poo.interfaz.pantallas.app;

import com.arturobarba.poo.interfaz.pantallas.app.cliente.PantallaNuevoPedido;
import com.arturobarba.poo.interfaz.pantallas.app.comercial.PantallaComercialGestionarNuevosPedidos;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.PantallaMenuGestionCliente;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.empleado.PantallaMenuGestionEmpleado;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.PantallaMenuGestionMueble;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido.PantallaListadoPedidos;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SubTituloElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import java.util.Arrays;
import java.util.List;

public class MenuPrincipal extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Menu principal"),
            new SubTituloElementoMenu("Acciones de jefe"),
            new ElementoMenu(1, "Asignar trabajo a artesano", null),
            new ElementoMenu(2, "Reponer stock de piezas", null),
            new SeparadorElementoMenu(),
            new SubTituloElementoMenu("Acciones de cliente"),
            new ElementoMenu(3, "Realizar nuevo pedido", new AccionMenuNavegar(new PantallaNuevoPedido())),
            new ElementoMenu(4, "Aceptar/Rechazar presupuestos", null),
            new ElementoMenu(5, "Recoger pedidos", null),
            new SeparadorElementoMenu(),
            new SubTituloElementoMenu("Acciones de comercial"),
            new ElementoMenu(6, "Gestionar nuevos pedidos", new AccionMenuNavegar(new PantallaComercialGestionarNuevosPedidos())),
            new ElementoMenu(7, "Notificar a cliente pendiente recogida", null),
            new SeparadorElementoMenu(),
            new SubTituloElementoMenu("Acciones de artesano"),
            new ElementoMenu(8, "Ver pedidos asignados", new AccionMenuNavegar(null)),
            new ElementoMenu(9, "Notificar terminación de fabricación", new AccionMenuNavegar(null)),
            new ElementoMenu(10, "Notificar incidencia", new AccionMenuNavegar(null)),

            new SeparadorElementoMenu(),
            new SubTituloElementoMenu("Gestión general"),
            new ElementoMenu(11, "Gestión de clientes", new AccionMenuNavegar(new PantallaMenuGestionCliente())),
            new ElementoMenu(12, "Gestión de empleados", new AccionMenuNavegar(new PantallaMenuGestionEmpleado())),
            new ElementoMenu(13, "Gestión de muebles", new AccionMenuNavegar(new PantallaMenuGestionMueble())),
            new ElementoMenu(14, "Ver pedidos", new AccionMenuNavegar(new PantallaListadoPedidos())),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }

}
