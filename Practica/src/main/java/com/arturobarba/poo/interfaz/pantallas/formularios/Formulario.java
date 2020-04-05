package com.arturobarba.poo.interfaz.pantallas.formularios;

import com.arturobarba.poo.interfaz.Pantalla;

public interface Formulario extends Pantalla {
    void rellenarCampos();

    boolean guardarDatos();

    void resetCampos();

}
