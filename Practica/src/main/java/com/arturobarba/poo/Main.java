package com.arturobarba.poo;

import com.arturobarba.poo.interfaz.Interfaz;
import com.arturobarba.poo.modelo.persona.empleado.Jefe;

public class Main {
    public static void main(String[] args) {
//        Interfaz.iniciar();

        Jefe jefe = new Jefe();
        jefe.setNombre("Pepe Luis");
        jefe.setSalario(100000);

        System.out.println(jefe.toString());
    }
}
