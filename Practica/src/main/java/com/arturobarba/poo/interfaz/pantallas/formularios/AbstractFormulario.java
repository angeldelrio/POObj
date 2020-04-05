package com.arturobarba.poo.interfaz.pantallas.formularios;

import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;

public abstract class AbstractFormulario implements Formulario {
    private boolean debeSalir = false;

    @Override
    public void mostrar() {
        while (!debeSalir) {
            rellenarCampos();
            guardarDatos();

            System.out.println("¿Desea añadir otro? s/N");
            String respuesta = Entrada.getString();
            if (respuesta != null && !"s".equalsIgnoreCase(respuesta) && !respuesta.trim().isEmpty()) {
                debeSalir = true;
            }
            resetCampos();
        }

        Interfaz.salirPantallaActual();
    }

    @Override
    public void salir() {
        debeSalir = true;
    }
}
