package com.arturobarba.poo.interfaz.pantallas.formularios;

import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.utils.StringUtils;

public abstract class AbstractFormulario implements Formulario {
    private boolean debeSalir = false;
    private final boolean agregarVarios;

    protected AbstractFormulario(boolean agregarVarios) {
        this.agregarVarios = agregarVarios;
    }


    @Override
    public void mostrar() {
        debeSalir = false;
        while (!debeSalir) {
            rellenarCampos();
            guardarDatos();

            if (agregarVarios) {
                Salida.println("¿Desea añadir otro? s/N");
                String respuesta = Entrada.getString();
                if (!StringUtils.estaEnBlanco(respuesta) && !"s".equalsIgnoreCase(respuesta)) {
                    debeSalir = true;
                }
            } else {
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
