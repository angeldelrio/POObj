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
    public void mostrarMenu() {
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
        Integer numOpcion;
        try {
            numOpcion = Entrada.getInt();
        } catch (Exception e) {
            numOpcion = null;
        }

        if (numOpcion == null || numOpcion < 0) {
            Salida.println("Opción inválida." + System.lineSeparator());
            return seleccionarElementoMenu();
        }
        return buscarElementoMenu(numOpcion);
    }

    @Override
    public ElementoMenu buscarElementoMenu(int numOpcion) {
        for (ElementoMenu elementoMenu : obtenerElementosMenu()) {
            if (elementoMenu.getNumOpcion() == numOpcion) {
                return elementoMenu;
            }
        }

        return null;
    }

    @Override
    public void salirMenu() {
        debeSalir = true;
    }

    public ElementoMenu getElementoMenuSeleccionado() {
        return elementoMenuSeleccionado;
    }
}
