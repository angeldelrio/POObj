package com.arturobarba.poo.servicios;

import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.mueble.Mueble;
import java.util.List;

public class ServicioGestionMuebles {
    private final Repositorio<Mueble> repositorioMuebles;

    public ServicioGestionMuebles() {
        this.repositorioMuebles = FactoriaRepositorios.repositorioMuebles();
    }

    public int guardar(Mueble mueble) {
        return repositorioMuebles.guardar(mueble);
    }

    public List<Integer> guardar(List<Mueble> muebles) {
        return repositorioMuebles.guardar(muebles);
    }

    public void eliminar(Mueble mueble) {
        eliminar(mueble.getId());
    }

    public void eliminar(int id) {
        repositorioMuebles.eliminar(id);
    }

    public List<Mueble> listar() {
        return repositorioMuebles.obtenerTodos();
    }
    
}
