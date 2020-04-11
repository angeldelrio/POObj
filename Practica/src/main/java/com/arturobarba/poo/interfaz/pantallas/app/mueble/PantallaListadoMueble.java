package com.arturobarba.poo.interfaz.pantallas.app.mueble;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
import com.arturobarba.poo.interfaz.pantallas.app.mueble.tablas.TablaMuebles;
import com.arturobarba.poo.modelo.mueble.Mueble;

public class PantallaListadoMueble extends PantallaTabla<Mueble> {
    public PantallaListadoMueble() {
       super(new TablaMuebles());
    }

    @Override
    public void mostrar() {
        getTabla().setModelos(Fabrica.MueblesArturo().muebles().listar());
        getTabla().mostrarTabla();
    }
}
