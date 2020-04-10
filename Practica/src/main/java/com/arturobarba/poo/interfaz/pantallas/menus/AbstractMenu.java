package com.arturobarba.poo.interfaz.pantallas.menus;

import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Salida;
import java.util.List;

public abstract class AbstractMenu implements Menu {
    private static final String TITULO_PROMPT_POR_DEFECTO = "Por favor seleccione una opción: ";

    private boolean debeSalir;
    private String tituloPrompt;
    private ElementoMenu elementoMenuSeleccionado;

    public AbstractMenu() {
        this(null);
    }

    public AbstractMenu(String tituloPrompt) {
        if (tituloPrompt == null || tituloPrompt.trim().isEmpty()) {
            this.tituloPrompt = TITULO_PROMPT_POR_DEFECTO;
        } else {
            this.tituloPrompt = tituloPrompt;
        }
    }

    @Override
    public void mostrar() {
        this.debeSalir = false;
        List<ElementoMenu> elementos = obtenerElementosMenu();

        for (ElementoMenu elementoMenu : elementos) {
            Salida.println(elementoMenu.toString());
        }

        Salida.println(tituloPrompt);
        elementoMenuSeleccionado = seleccionarElementoMenu();

        if (debeSalir) {
            return;
        }

        if (elementoMenuSeleccionado == null) {
            return;
        }

        if (elementoMenuSeleccionado.getAccionMenu() != null) {
            elementoMenuSeleccionado.getAccionMenu().realizarAccion(elementoMenuSeleccionado);
        }
    }

    @Override
    public ElementoMenu seleccionarElementoMenu() {
        int numOpcion = -1;
        try {
            numOpcion = Entrada.getInt();
        } catch (Exception e) {
            numOpcion = -1;
        }

        if (numOpcion < 0) {
            Salida.println("Opción inválida." + System.lineSeparator());
            Entrada.next();
            return seleccionarElementoMenu();
        }
        return obtenerElementoMenu(numOpcion);
    }

    @Override
    public ElementoMenu obtenerElementoMenu(int numOpcion) {
        for (ElementoMenu elementoMenu : obtenerElementosMenu()) {
            if (elementoMenu.getNumOpcion() == numOpcion) {
                return elementoMenu;
            }
        }

        return null;
    }

    @Override
    public void salir() {
        debeSalir = true;
    }

    public ElementoMenu getElementoMenuSeleccionado() {
        return elementoMenuSeleccionado;
    }
}
