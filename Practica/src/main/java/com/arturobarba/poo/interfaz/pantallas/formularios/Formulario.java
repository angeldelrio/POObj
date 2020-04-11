package com.arturobarba.poo.interfaz.pantallas.formularios;

import com.arturobarba.poo.interfaz.Pantalla;

public interface Formulario {
    void mostrarFormulario();

    boolean guardarDatos();

    void resetCampos();

    boolean quiereAgregarVarios();

}
