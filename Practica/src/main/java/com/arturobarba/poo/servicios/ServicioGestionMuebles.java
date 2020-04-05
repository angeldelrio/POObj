package com.arturobarba.poo.servicios;

import com.arturobarba.poo.modelo.FactoriaRepositorios;
import com.arturobarba.poo.modelo.Repositorio;
import com.arturobarba.poo.modelo.mueble.Mueble;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ServicioGestionMuebles {
    private final Repositorio<Mueble> repositorioMuebles;

    public ServicioGestionMuebles() {
        this.repositorioMuebles = FactoriaRepositorios.repositorioMuebles();
    }

    public List<Mueble> obtenerMueblesOrdenadosPorTipo() {
        List<Mueble> todos = new ArrayList<>(repositorioMuebles.obtenerTodos());

        Collections.sort(todos, new Comparator<Mueble>() {
            @Override
            public int compare(Mueble a, Mueble b) {
                return a.getClass().getSimpleName().compareToIgnoreCase(b.getClass().getSimpleName());
            }
        });

        return todos;
    }
}
