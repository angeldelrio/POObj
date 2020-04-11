package com.arturobarba.poo.interfaz.pantallas.app.mueble.tablas;

import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.pantallas.app.mueble.PantallaEditarMueble;
import com.arturobarba.poo.interfaz.pantallas.tablas.AccionTabla;
import com.arturobarba.poo.modelo.mueble.Mueble;

public class AccionTablaEditarMueble extends AccionTabla<Mueble> {

    public AccionTablaEditarMueble() {
        super("e", "Editar mueble");
    }

    @Override
    public void realizarAccion(Mueble mueble) {
        Interfaz.navegarAPantalla(new PantallaEditarMueble(mueble, false));
    }
}
