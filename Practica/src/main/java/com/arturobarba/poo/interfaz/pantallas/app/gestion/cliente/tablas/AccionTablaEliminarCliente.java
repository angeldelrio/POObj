package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.tablas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;

public class AccionTablaEliminarCliente extends AccionTabla<Cliente> {

    public AccionTablaEliminarCliente() {
        super("b", "Borrar cliente");
    }

    @Override
    public void realizarAccion(Cliente cliente) {
        Fabrica.MueblesArturo().clientes().eliminar(cliente);
    }
}
