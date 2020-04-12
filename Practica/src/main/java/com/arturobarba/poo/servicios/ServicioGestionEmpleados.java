package com.arturobarba.poo.servicios;

import static com.arturobarba.poo.utils.StringUtils.estaEnBlanco;
import com.arturobarba.poo.modelo.CriterioBusqueda;
import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.criteriosbusqueda.CriterioBusquedaPorTipo;
import java.util.List;

public class ServicioGestionEmpleados {
    private final Repositorio<Empleado> repositorioEmpleado;

    public ServicioGestionEmpleados() {
        this.repositorioEmpleado = FactoriaRepositorios.repositorioEmpleados();
    }

    public int guardar(Empleado empleado) {
        return repositorioEmpleado.guardar(empleado);
    }

    public List<Integer> guardar(List<Empleado> empleados) {
        return repositorioEmpleado.guardar(empleados);
    }

    public void eliminar(Empleado empleado) {
        eliminar(empleado.getId());
    }

    public void eliminar(int id) {
        repositorioEmpleado.eliminar(id);
    }

    public List<Empleado> listar() {
        return repositorioEmpleado.obtenerTodos();
    }

    public List<Empleado> buscarPorTipo(Class<? extends Empleado> tipo) {
        return repositorioEmpleado.buscar(new CriterioBusquedaPorTipo(tipo));
    }

    public Comercial buscarComercialPorNif(final String nif) {
        if (estaEnBlanco(nif)) {
            return null;
        }

        return repositorioEmpleado.buscarUno(new CriterioBusqueda<Empleado>() {
            @Override
            public boolean cumpleCriterio(Empleado entidad) {
                return entidad instanceof Comercial && nif.equalsIgnoreCase(entidad.getNif());
            }
        });
    }

}
