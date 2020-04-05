package com.arturobarba.poo.servicios;

import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import java.util.List;

public class ServicioGestionEmpleados {
    private final Repositorio<Empleado> repositorioEmpleado;

    public ServicioGestionEmpleados() {
        this.repositorioEmpleado = FactoriaRepositorios.repositorioEmpleados();
    }

    public int guardar(Empleado empleado) {
        return repositorioEmpleado.guardar(empleado);
    }

    public List<Empleado> listar() {
        return repositorioEmpleado.obtenerTodos();
    }

}
