package com.arturobarba.poo.interfaz.pantallas.menus;

public class ElementoMenu {
    private final String enunciado;
    private final int numOpcion;
    private final AccionMenu accionMenu;

    public ElementoMenu(int numOpcion, String enunciado, AccionMenu accionMenu) {
        this.enunciado = enunciado;
        this.numOpcion = numOpcion;
        this.accionMenu = accionMenu;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getNumOpcion() {
        return numOpcion;
    }

    public AccionMenu getAccionMenu() {
        return accionMenu;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s", numOpcion, enunciado);
    }
}
