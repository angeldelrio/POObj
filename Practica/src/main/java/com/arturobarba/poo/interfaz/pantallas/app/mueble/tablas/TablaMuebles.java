package com.arturobarba.poo.interfaz.pantallas.app.mueble.tablas;

import com.arturobarba.poo.interfaz.pantallas.tablas.AbstractTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.interfaz.pantallas.tablas.Columna;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.interfaz.pantallas.tablas.SalirAccionTabla;
import com.arturobarba.poo.modelo.mueble.Mueble;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TablaMuebles extends AbstractTabla<Mueble> {

    @Override
    public List<Columna> obtenerColumnas() {
        return Arrays.asList(
            new Columna("#ID", 4),
            new Columna("Tipo", 6),
            new Columna("Subtipo", 20),
            new Columna("¿ruedas?", 8),
            new Columna("¿plegable?", 10),
            new Columna("Modelo", 25),
            new Columna("Material", 10),
            new Columna("Precio", 8)
        );
    }

    @Override
    public Fila<Mueble> convertirAFila(Mueble mueble) {
        return new FilaMueble(mueble);
    }

    @Override
    public List<AccionTabla<Mueble>> obtenerAcciones() {

        return Arrays.asList(
            new AccionTablaEditarMueble(),
            new AccionTablaEliminarMueble(),
            new SalirAccionTabla<Mueble>()
        );
    }


}
