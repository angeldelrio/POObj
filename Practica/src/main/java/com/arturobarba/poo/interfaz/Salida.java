package com.arturobarba.poo.interfaz;

public class Salida {
    public final static String SEPARADOR_GRANDE = "=====================================================================";
    public final static String SEPARADOR_FINO = "---------------------------------------------------------------------";

    public static void println(String valor) {
        System.out.println(valor);
    }

    public static void print(String valor) {
        System.out.print(valor);
    }

    public static void titulo(String titulo) {
        println(titulo.toUpperCase());
        separadorGrande();
    }

    public static void separadorFino() {
        println(SEPARADOR_FINO);
    }

    public static void separadorGrande() {
        println(SEPARADOR_GRANDE);
    }

}
