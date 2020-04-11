package com.arturobarba.poo.interfaz.pantallas.formularios;

public abstract class AbstractFormulario implements Formulario {

    private final boolean quiereAgregarVarios;

    protected AbstractFormulario(boolean quiereAgregarVarios) {
        this.quiereAgregarVarios = quiereAgregarVarios;
    }

    public boolean quiereAgregarVarios() {
        return quiereAgregarVarios;
    }
}
