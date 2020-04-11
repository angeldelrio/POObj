package com.arturobarba.poo.interfaz.pantallas.app.cliente;

import com.arturobarba.poo.interfaz.pantallas.PantallaFormulario;
import com.arturobarba.poo.interfaz.pantallas.app.cliente.formularios.FormularioEditarCliente;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;

public class PantallaEditarCliente extends PantallaFormulario {
    public PantallaEditarCliente(Cliente clienteEditado, boolean quiereAgregarVarios) {
        super(new FormularioEditarCliente(clienteEditado, quiereAgregarVarios));
    }
}
