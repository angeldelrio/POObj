package com.arturobarba.poo.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Repositorio<T extends Identificable> {

    private final Map<Integer, T> entidades;
    private int idActual;

    protected Repositorio() {
        entidades = new HashMap<>();
        idActual = 0;
    }

    /**
     *
     * @param entidad
     * @return Id de la entidad guardada si es nueva, o el id de la entidad ya existente
     */
    public int guardar(T entidad) {
        if (entidad == null) {
            throw new IllegalArgumentException("No se puede guardar un objeto null");
        }

        if (entidad.getId() == null) {
            entidad.setId(++idActual);
        }

        entidades.put(entidad.getId(), entidad);

        return entidad.getId();
    }

    public List<Integer> guardar(List<T> entidades) {
        List<Integer> ids = new ArrayList<>();
        for (T entidad : entidades) {
            ids.add(guardar(entidad));
        }

        return ids;
    }

    public T obtener(int id) {
        return entidades.get(id);
    }


    public void eliminar(int id) {
        entidades.remove(id);
    }

    public <S extends T> S buscarUno(CriterioBusqueda<T> criterio) {
        if (criterio == null) {
            throw new IllegalArgumentException("Es necesario un criterio de búsqueda");
        }

        for (T entidad : entidades.values()) {
            if (criterio.cumpleCriterio(entidad)) {
                return (S)entidad;
            }
        }

        return null;
    }

    public <S extends T> List<S> buscar(CriterioBusqueda<T> criterio) {
        if (criterio == null) {
            throw new IllegalArgumentException("Es necesario un criterio de búsqueda");
        }

        List<S> encontrados = new ArrayList<>();

        for (T entidad : entidades.values()) {
            if (criterio.cumpleCriterio(entidad)) {
                encontrados.add((S)entidad);
            }
        }

        return encontrados;
    }

    public List<T> obtenerTodos() {
        return new ArrayList<>(entidades.values());
    }
}
