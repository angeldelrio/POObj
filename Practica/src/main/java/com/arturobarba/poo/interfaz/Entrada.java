package com.arturobarba.poo.interfaz;

import java.util.*;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    private static Scanner lector;
    static {
        lector = new Scanner(System.in);
    }

    public static Integer getInt() {
        String valor = getString();
        Integer valorEntero;
        try {
            valorEntero = Integer.valueOf(valor);
        } catch (Exception e) {
            valorEntero = null;
        }

        return valorEntero;
    }

    public static Float getFloat() {
        String valor = getString();
        Float valorFloat;
        try {
            valor = valor.replace(",", ".");
            valorFloat = Float.parseFloat(valor);
        } catch (Exception e) {
            valorFloat = null;
        }

        return valorFloat;
    }

    public static String getString() {
        return lector.nextLine();
    }
}
