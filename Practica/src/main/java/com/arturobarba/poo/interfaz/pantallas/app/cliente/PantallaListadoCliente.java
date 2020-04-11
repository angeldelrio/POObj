package com.arturobarba.poo.interfaz.pantallas.app.cliente;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
import com.arturobarba.poo.interfaz.pantallas.app.cliente.tablas.TablaClientes;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;

public class PantallaListadoCliente extends PantallaTabla<Cliente> {
    public PantallaListadoCliente() {
       super(new TablaClientes());
    }

    @Override
    public void mostrar() {
        getTabla().setModelos(Fabrica.MueblesArturo().clientes().listar());
        getTabla().mostrarTabla();
    }
}
