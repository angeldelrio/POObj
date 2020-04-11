package com.arturobarba.poo;

import com.arturobarba.poo.interfaz.Interfaz;

public class Main {
    public static void main(String[] args) {
        DataSetPruebas.DataSetEmpleados.generarDataSetEmpleados();
        DataSetPruebas.DataSetClientes.generarDataSetClientes();
        DataSetPruebas.DataSetMuebles.generarDataSetMuebles();

        Interfaz.iniciar();
    }
}
