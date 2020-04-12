package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.tablas;

import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.PantallaEditarCliente;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;

public class AccionTablaEditarCliente extends AccionTabla<Cliente> {

    public AccionTablaEditarCliente() {
        super("e", "Editar cliente");
    }

    @Override
    public void realizarAccion(Cliente cliente) {
        Interfaz.navegarAPantalla(new PantallaEditarCliente(cliente, false));
    }
}
