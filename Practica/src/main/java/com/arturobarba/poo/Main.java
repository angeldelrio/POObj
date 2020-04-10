package com.arturobarba.poo;

import com.arturobarba.poo.interfaz.Interfaz;

public class Main {
    public static void main(String[] args) {
        DataSetPruebas.generarDataSetEmpleados();
        DataSetPruebas.generarDataSetClientes();
        Interfaz.iniciar();
    }
}
