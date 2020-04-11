package com.arturobarba.poo.interfaz.pantallas;

import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.Pantalla;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.interfaz.pantallas.formularios.Formulario;
import com.arturobarba.poo.utils.StringUtils;

public abstract class PantallaFormulario implements Pantalla {
    private boolean debeSalir = false;
    private final Formulario formulario;

    public PantallaFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    @Override
    public void mostrar() {
        debeSalir = false;
        while (!debeSalir) {
            formulario.mostrarFormulario();
            formulario.guardarDatos();

            if (formulario.quiereAgregarVarios()) {
                Salida.println("¿Desea añadir otro? s/N");
                String respuesta = Entrada.getString();
                if (!StringUtils.estaEnBlanco(respuesta) && !"s".equalsIgnoreCase(respuesta)) {
                    debeSalir = true;
                }
            } else {
                debeSalir = true;
            }

            formulario.resetCampos();
        }

        Interfaz.salirPantallaActual();
    }

    @Override
    public void salir() {
        debeSalir = true;
    }
}
