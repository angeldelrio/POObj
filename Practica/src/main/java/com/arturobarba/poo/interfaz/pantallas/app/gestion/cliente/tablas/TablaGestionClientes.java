package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.tablas;

import com.arturobarba.poo.interfaz.pantallas.tablas.AbstractTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.Columna;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.interfaz.pantallas.tablas.SalirAccionTabla;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import java.util.Arrays;
import java.util.List;

public class TablaGestionClientes extends AbstractTabla<Cliente> {

    @Override
    public List<Columna> obtenerColumnas() {
        return Arrays.asList(
            new Columna("#ID", 4),
            new Columna("Tipo", 20),
            new Columna("NIF/CIF", 10),
            new Columna("Nombre", 30),
            new Columna("IBAN", 20),
            new Columna("Tipo Empresa", 20)
        );
    }

    @Override
    public Fila<Cliente> convertirAFila(Cliente cliente) {
        return new FilaCliente(cliente);
    }

    @Override
    public List<AccionTabla<Cliente>> obtenerAcciones() {
        return Arrays.asList(
            new AccionTablaEditarCliente(),
            new AccionTablaEliminarCliente(),
            new SalirAccionTabla<Cliente>()
        );
    }


}
