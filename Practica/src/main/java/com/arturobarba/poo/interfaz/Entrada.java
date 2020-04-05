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

    public static int getInt() {
        int valor = lector.nextInt();
        lector.nextLine();
        return valor;
    }
    
    public static String getString() {
        return lector.nextLine();
    }

    public static void next() {
        lector.next();
    }

    public static void reset() {
        lector = lector.reset();
    }
}
