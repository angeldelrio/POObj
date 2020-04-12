package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.tablas;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.mueble.Mueble;

public class AccionTablaEliminarMueble extends AccionTabla<Mueble> {

    public AccionTablaEliminarMueble() {
        super("b", "Borrar mueble");
    }

    @Override
    public void realizarAccion(Mueble mueble) {
        Fabrica.MueblesArturo().muebles().eliminar(mueble);
    }
}
