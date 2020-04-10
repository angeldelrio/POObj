package com.arturobarba.poo.interfaz;

import com.arturobarba.poo.interfaz.pantallas.menus.principal.MenuPrincipal;
import java.util.ArrayDeque;
import java.util.Deque;

public class Interfaz {
    private static Deque<Pantalla> navegacionPantallas;

    public static void iniciar() {
        navegacionPantallas = new ArrayDeque<>();
        navegacionPantallas.push(new MenuPrincipal());

        while(!navegacionPantallas.isEmpty()) {
            navegacionPantallas.getFirst().mostrar();
        }

        Salida.println("Cerrando aplicación...");
    }

    public static void navegarAPantalla(Pantalla pantalla) {
        Pantalla actual = navegacionPantallas.peek();
        actual.salir();
        navegacionPantallas.push(pantalla);
    }

    public static void salirPantallaActual() {
        Pantalla actual = navegacionPantallas.pop();
        actual.salir();
    }
}
