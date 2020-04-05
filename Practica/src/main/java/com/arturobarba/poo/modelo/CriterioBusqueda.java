package com.arturobarba.poo.modelo;

public interface CriterioBusqueda<T extends Identificable> {
    boolean cumpleCriterio(T entidad);
}
