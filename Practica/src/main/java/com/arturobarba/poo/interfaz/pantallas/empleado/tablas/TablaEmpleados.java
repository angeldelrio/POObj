package com.arturobarba.poo.interfaz.pantallas.empleado.tablas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Pantalla;
import com.arturobarba.poo.interfaz.pantallas.tablas.AbstractTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.Columna;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.interfaz.pantallas.tablas.SalirAccionTabla;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import java.util.Arrays;
import java.util.List;

public class TablaEmpleados extends AbstractTabla<Empleado> implements Pantalla {

    @Override
    public List<Columna> obtenerColumnas() {
        return Arrays.asList(
            new Columna("#ID", 4),
            new Columna("Cargo", 20),
            new Columna("NIF/CIF", 10),
            new Columna("Nombre", 30),
            new Columna("Salario", 8),
            new Columna("Pedido", 10)
        );
    }

    @Override
    public Fila<Empleado> convertirAFila(Empleado empleado) {
        return new FilaEmpleado(empleado);
    }

    @Override
    public List<AccionTabla<Empleado>> obtenerAcciones() {
        return Arrays.asList(
            new AccionTablaEditarEmpleado(),
            new AccionTablaEliminarEmpleado(),
            new SalirAccionTabla<Empleado>()
        );
    }

    @Override
    public void mostrar() {
        setModelos(Fabrica.MueblesArturo().empleados().listar());
        mostrarTabla();
    }

    @Override
    public void salir() {
    }
}
