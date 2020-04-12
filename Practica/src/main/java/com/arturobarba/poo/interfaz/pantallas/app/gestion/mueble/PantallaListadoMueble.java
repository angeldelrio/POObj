package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.PantallaTabla;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.tablas.TablaGestionMuebles;
import com.arturobarba.poo.modelo.mueble.Mueble;

public class PantallaListadoMueble extends PantallaTabla<Mueble> {
    public PantallaListadoMueble() {
       super(new TablaGestionMuebles());
    }

    @Override
    public void mostrar() {
        getTabla().setModelos(Fabrica.MueblesArturo().muebles().listar());
        getTabla().mostrarTabla();
    }
}
