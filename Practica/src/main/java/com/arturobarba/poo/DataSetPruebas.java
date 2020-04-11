package com.arturobarba.poo;

import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.mueble.mesa.MesaCafeCristal;
import com.arturobarba.poo.modelo.mueble.mesa.MesaCafeMadera;
import com.arturobarba.poo.modelo.mueble.mesa.MesaDeComedor;
import com.arturobarba.poo.modelo.mueble.mesa.MesaDeDormitorio;
import com.arturobarba.poo.modelo.mueble.silla.SillaCocina;
import com.arturobarba.poo.modelo.mueble.silla.SillaOficinaConRuedas;
import com.arturobarba.poo.modelo.mueble.silla.SillaOficinaSinRuedas;
import com.arturobarba.poo.modelo.mueble.silla.SillaPlegable;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa.TipoEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteParticular;
import com.arturobarba.poo.modelo.persona.empleado.Comercial;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.Jefe;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoHora;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoPlantilla;
import com.arturobarba.poo.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataSetPruebas {
    private static List<String> nombresPropios;
    private static List<String> apellidos;
    private static List<String> colores;
    private static List<String> adjetivos;
    private static List<String> sustantivos;
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

        colores = Arrays.asList(
            "White", "Black", "Golden", "Silver", "Brown", "Perl", "Violet", "Grey", "Yellow", "Pink"
        );

        adjetivos = Arrays.asList(
            "Luxury", "Comfort", "Caribean", "Artic", "Oriental", "Performant", "Precious", "Pretty",
            "Alpine", "Rustic", "Western", "Pop", "Imaginative"
        );

        sustantivos = Arrays.asList(
            "Jörnfrom", "Eagle", "Gromenagüer", "Martin", "Paradise", "Jorton", "Furniture", "Phoenix",
            "RestForm", "Polscran", "Prákta"
        );
    }

    public static int enteroAleatorioEntreRango(int min, int max) {
        return (int) decimalAleatorioEntreRango(min, max);

    }

    public static float decimalAleatorioEntreRango(float min, float max) {
        return (float) (Math.random() * ((max + 1) - min)) + min;
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

    public static String generarColor() {
        return colores.get(enteroAleatorioEntreRango(0, colores.size() - 1));
    }

    public static String generarAdjetivo() {
        return adjetivos.get(enteroAleatorioEntreRango(0, adjetivos.size() - 1));
    }

    public static String generarSustantivo() {
        return sustantivos.get(enteroAleatorioEntreRango(0, sustantivos.size() - 1));
    }

    public static String generarNombreMueble() {
        String color = "";
        if (randomBoolean()) {
            color = generarColor();
        }

        String adjetivo = "";
        if (randomBoolean() || StringUtils.estaEnBlanco(color)) {
            adjetivo = generarAdjetivo();
        }

        return String.format("%s %s %s", color, adjetivo, generarSustantivo());
    }

    public static class DataSetEmpleados {
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
    }

    public static class DataSetClientes {
        public static ClienteEmpresa generarClienteEmpresa() {
            String nombreEmpresa = "Muebles " + generarApellido();
            nombreEmpresa += " " + (randomBoolean() ? "S.A." : "S.L.");

            ClienteEmpresa clienteEmpresa = new ClienteEmpresa();
            clienteEmpresa.setNombre(nombreEmpresa);
            clienteEmpresa.setNif(generarCIF());
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

    public static class DataSetMuebles {
        private static void rellenarCamposMueble(Mueble mueble) {
            mueble.setPrecio(decimalAleatorioEntreRango(100, 999));
            mueble.setModelo(generarNombreMueble());
        }

        public static SillaCocina generarSillaCocina() {
            SillaCocina sillaCocina = new SillaCocina();
            rellenarCamposMueble(sillaCocina);

            return sillaCocina;
        }

        public static SillaOficinaConRuedas generarSillaOficinaConRuedas() {
            SillaOficinaConRuedas sillaOficinaConRuedas = new SillaOficinaConRuedas();
            rellenarCamposMueble(sillaOficinaConRuedas);

            return sillaOficinaConRuedas;
        }

        public static SillaOficinaSinRuedas generarSillaOficinaSinRuedas() {
            SillaOficinaSinRuedas sillaOficinaSinRuedas = new SillaOficinaSinRuedas();
            rellenarCamposMueble(sillaOficinaSinRuedas);

            return sillaOficinaSinRuedas;
        }

        public static SillaPlegable generarSillaPlegable() {
            SillaPlegable sillaPlegable = new SillaPlegable();
            rellenarCamposMueble(sillaPlegable);

            return sillaPlegable;
        }

        public static MesaCafeCristal generarMesaCafeCristal() {
            MesaCafeCristal mesaCafeCristal = new MesaCafeCristal();
            rellenarCamposMueble(mesaCafeCristal);

            return mesaCafeCristal;
        }

        public static MesaCafeMadera generarMesaCafeMadera() {
            MesaCafeMadera mesaCafeMadera = new MesaCafeMadera();
            rellenarCamposMueble(mesaCafeMadera);

            return mesaCafeMadera;
        }

        public static MesaDeComedor generarMesaDeComedor() {
            MesaDeComedor mesaDeComedor = new MesaDeComedor();
            rellenarCamposMueble(mesaDeComedor);

            return mesaDeComedor;
        }

        public static MesaDeDormitorio generarMesaDeDormitorio() {
            MesaDeDormitorio mesaDeDormitorio = new MesaDeDormitorio();
            rellenarCamposMueble(mesaDeDormitorio);

            return mesaDeDormitorio;
        }

        public static void generarDataSetMuebles() {
            List<Mueble> muebles = new ArrayList<>();

            for (int i = 0; i <= 30; i++) {
                int rand = enteroAleatorioEntreRango(0, 7);
                Mueble mueble = null;
                switch (rand) {
                    case 0:
                        mueble = generarSillaCocina();
                        break;
                    case 1:
                        mueble = generarSillaOficinaConRuedas();
                        break;
                    case 2:
                        mueble = generarSillaOficinaSinRuedas();
                        break;
                    case 3:
                        mueble = generarSillaPlegable();
                        break;
                    case 4:
                        mueble = generarMesaCafeCristal();
                        break;
                    case 5:
                        mueble = generarMesaCafeMadera();
                        break;
                    case 6:
                        mueble = generarMesaDeComedor();
                        break;
                    case 7:
                        mueble = generarMesaDeDormitorio();
                        break;
                }

                muebles.add(mueble);
            }

            Fabrica.MueblesArturo().muebles().guardar(muebles);
        }
    }


}
