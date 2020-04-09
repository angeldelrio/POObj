package com.arturobarba.poo.interfaz.pantallas.formularios;

import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.utils.StringUtils;

public abstract class AbstractFormulario implements Formulario {
    private boolean debeSalir = false;

    @Override
    public void mostrar() {
        while (!debeSalir) {
            rellenarCampos();
            guardarDatos();

            Salida.println("¿Desea añadir otro? s/N");
            String respuesta = Entrada.getString();
            if (!StringUtils.estaEnBlanco(respuesta) && !"s".equalsIgnoreCase(respuesta)) {
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
