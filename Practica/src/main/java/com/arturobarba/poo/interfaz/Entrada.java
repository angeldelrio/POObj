package com.arturobarba.poo.interfaz;

import com.arturobarba.poo.utils.StringUtils;
import java.util.Scanner;
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
        String valor = lector.next();
        lector.nextLine();
        Integer valorEntero;
        try {
            valorEntero = Integer.valueOf(valor);
        } catch (Exception e) {
            valorEntero = null;
        }

        return valorEntero;
    }

    public static Float getFloat() {
        String valor = lector.next();
        lector.nextLine();
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

    public static boolean confirmar(String enunciado) {
        Salida.println(String.format("%s s/N", enunciado));
        String respuesta = Entrada.getString();

        return !StringUtils.estaEnBlanco(respuesta) && "s".equalsIgnoreCase(respuesta);
    }

    public static void pulseCualquierTeclaParaContinuar() {
        Salida.println("Presione cualquier tecla para continuar...");
        getString();
    }
}
