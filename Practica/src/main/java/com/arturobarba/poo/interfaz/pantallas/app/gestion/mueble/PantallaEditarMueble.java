package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble;

import com.arturobarba.poo.interfaz.pantallas.PantallaFormulario;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.formularios.FormularioEditarMueble;
import com.arturobarba.poo.modelo.mueble.Mueble;

public class PantallaEditarMueble extends PantallaFormulario {
    public PantallaEditarMueble(Mueble muebleEditado, boolean quiereAgregarVarios) {
        super(new FormularioEditarMueble(muebleEditado, quiereAgregarVarios));
    }
}
