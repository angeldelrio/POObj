package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.tablas.TablaGestionClientes;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;

public class PantallaListadoCliente extends PantallaTabla<Cliente> {
    public PantallaListadoCliente() {
       super(new TablaGestionClientes());
    }

    @Override
    public void mostrar() {
        getTabla().setModelos(Fabrica.MueblesArturo().clientes().listar());
        if (getTabla().mostrarTabla() == null) {
            Interfaz.salirPantallaActual();
        }
    }
}
