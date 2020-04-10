package com.arturobarba.poo;

import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa.TipoEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteParticular;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.Jefe;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoHora;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoPlantilla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataSetPruebas {
    private static List<String> nombresPropios;
    private static List<String> apellidos;
    private static List<String> nombresEmpresa;
    private static String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static {
        nombresPropios = Arrays.asList(
            "Ángel", "María", "Carmen", "Arturo", "Lourdes", "Carlos", "Antonio", "Germán",
            "Soledad", "Marcos", "Adrián", "Mercedes", "Rocío", "Adán", "Luis", "Almudena"
        );

        apellidos = Arrays.asList(
            "García", "Barba", "López", "Olmedo", "Pérez", "Rodríguez", "Román", "Mellado",
            "Escobar", "Banderas", "Delgado", "Ramos", "González", "Fernández", "Gómez", "Martín",
            "Ruiz", "Hernández", "Díaz", "Torres", "Muñoz", "Jiménez", "Vázquez", "Serrano", "Molina"
        );

        nombresEmpresa = Arrays.asList(
            ""
        );
    }

    public static int enteroAleatorioEntreRango(int min, int max) {
        return (int) (Math.random() * ((max + 1) - min)) + min;

    }

    public static String letraAleatoria() {
        return String.valueOf(letras.charAt(enteroAleatorioEntreRango(0, letras.length() - 1)));
    }

    public static boolean randomBoolean() {
        return new Random().nextBoolean();
    }

    public static String generarDNI() {
        String dni = "";

        for (int i = 0; i < 8; i++) {
            dni += String.valueOf(enteroAleatorioEntreRango(0, 9));
        }

        return dni + letraAleatoria();
    }

    public static String generarCIF() {
        String cif = letraAleatoria();

        for (int i = 0; i < 8; i++) {
            cif += String.valueOf(enteroAleatorioEntreRango(0, 9));
        }

        return cif;
    }

    public static String generarNombrePropio() {
        return nombresPropios.get(enteroAleatorioEntreRango(0, nombresPropios.size() - 1));
    }

    public static String generarApellido() {
        return apellidos.get(enteroAleatorioEntreRango(0, nombresPropios.size() - 1));
    }

    public static String generarNombrePropioCompleto() {
        String nombre = generarNombrePropio();
        String primerApellido = generarApellido();
        String segundoApellido = generarApellido();

        return String.format("%s %s %s", nombre, primerApellido, segundoApellido);
    }

    public static String generarIBAN() {
        return String.format(
            "ES%s %s %s %s %s %s",
            enteroAleatorioEntreRango(10, 99),
            enteroAleatorioEntreRango(1000, 9999),
            enteroAleatorioEntreRango(1000, 9999),
            enteroAleatorioEntreRango(1000, 9999),
            enteroAleatorioEntreRango(1000, 9999),
            enteroAleatorioEntreRango(1000, 9999)
        );
    }

    private static void rellenarCamposEmpleado(Empleado empleado) {
        empleado.setNombre(generarNombrePropioCompleto());
        empleado.setNif(generarDNI());
        empleado.setSalario(enteroAleatorioEntreRango(10000, 20000));
    }

    public static Comercial generarComercial() {
        Comercial comercial = new Comercial();
        rellenarCamposEmpleado(comercial);
        return comercial;
    }

    public static ArtesanoHora generarArtesanoHora() {
        ArtesanoHora artesanoHora = new ArtesanoHora();
        rellenarCamposEmpleado(artesanoHora);
        artesanoHora.setHorasDeTrabajo(enteroAleatorioEntreRango(1, 8));

        return artesanoHora;
    }

    public static ArtesanoPlantilla generarArtesanoPlantilla() {
        ArtesanoPlantilla artesanoPlantilla = new ArtesanoPlantilla();
        rellenarCamposEmpleado(artesanoPlantilla);
        return artesanoPlantilla;
    }

    public static Jefe generarJefe() {
        Jefe jefe = new Jefe();
        rellenarCamposEmpleado(jefe);
        jefe.setSalario(enteroAleatorioEntreRango(40000, 60000));

        return jefe;
    }

    public static void generarDataSetEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(generarJefe());

        for (int i = 0; i <= 5; i++) {
            empleados.add(generarComercial());
        }

        for (int i = 0; i <= 10; i++) {
            empleados.add(
                randomBoolean() ? generarArtesanoHora() : generarArtesanoPlantilla()
            );
        }

        Fabrica.MueblesArturo().empleados().guardar(empleados);
    }

    public static ClienteEmpresa generarClienteEmpresa() {
        String nombreEmpresa = "Muebles " + generarApellido();
        nombreEmpresa += " " + (randomBoolean() ? "S.A." : "S.L.");

        ClienteEmpresa clienteEmpresa = new ClienteEmpresa();
        clienteEmpresa.setNombre(nombreEmpresa);
        clienteEmpresa.setNif(generarDNI());
        clienteEmpresa.setIban(generarIBAN());
        clienteEmpresa.setTipoEmpresa(TipoEmpresa.values()[enteroAleatorioEntreRango(0, 1)]);

        return clienteEmpresa;
    }

    public static ClienteParticular generarClienteParticular() {
        ClienteParticular clienteParticular = new ClienteParticular();
        clienteParticular.setNombre(generarNombrePropioCompleto());
        clienteParticular.setNif(generarDNI());
        clienteParticular.setIban(generarIBAN());

        return clienteParticular;
    }

    public static void generarDataSetClientes() {
        List<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            clientes.add(
                randomBoolean() ? generarClienteParticular() : generarClienteEmpresa()
            );
        }

        Fabrica.MueblesArturo().clientes().guardar(clientes);
    }

}
