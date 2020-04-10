package com.arturobarba.poo.interfaz;

import com.arturobarba.poo.utils.StringUtils;

public class Salida {
    public static String SEPARADOR_GRANDE = StringUtils.repetirString("=", 80);
    public static String SEPARADOR_FINO = StringUtils.repetirString("-", 80);

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
