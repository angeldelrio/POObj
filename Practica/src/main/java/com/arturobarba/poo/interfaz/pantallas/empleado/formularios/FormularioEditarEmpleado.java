package com.arturobarba.poo.interfaz.pantallas.empleado.formularios;

import static com.arturobarba.poo.utils.StringUtils.*;
import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.interfaz.pantallas.formularios.AbstractFormulario;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoHora;
import com.arturobarba.poo.utils.StringUtils;

public class FormularioEditarEmpleado extends AbstractFormulario {

    private Empleado empleadoEditado;

    public FormularioEditarEmpleado(Empleado empleadoEditado, boolean agregarVarios) {
        super(agregarVarios);
        this.empleadoEditado = empleadoEditado;
    }

    @Override
    public void rellenarCampos() {
        if (empleadoEditado == null) {
            return;
        }

        if (empleadoEditado.getId() == null) {
            Salida.titulo("Creando nuevo empleado");
        } else {
            Salida.titulo("Editando empleado #" + empleadoEditado.getId() + " " + empleadoEditado.getNombre());
            Salida.println("Si no desea modificar el valor de un campo, déjelo en blanco");
            Salida.separadorFino();
        }

        Entrada.reset();
        rellenarCamposComunes();

        if (empleadoEditado instanceof ArtesanoHora) {
            rellenarCamposArtesanoHora();
        }
    }

    private void rellenarCamposComunes() {
        Salida.println(String.format("NIF (%s):", normalizarString(empleadoEditado.getNif())));
        String nif = Entrada.getString();
        if (!StringUtils.estaEnBlanco(nif)) {
            empleadoEditado.setNif(nif);
        }

        Salida.println(String.format("Nombre (%s):", normalizarString(empleadoEditado.getNombre())));
        String nombre = Entrada.getString();
        if (!StringUtils.estaEnBlanco(nombre)) {
            empleadoEditado.setNombre(nombre);
        }

        Salida.println(String.format("Salario (%s€):", normalizarInteger(empleadoEditado.getSalario())));
        String salario = Entrada.getString();
        if (!StringUtils.estaEnBlanco(salario)) {
            empleadoEditado.setSalario(Integer.parseInt(salario));
        }
    }

    private void rellenarCamposArtesanoHora() {
        Salida.println(
            String.format("Horas de trabajo (%s):", normalizarInteger(((ArtesanoHora)empleadoEditado).getHorasDeTrabajo()))
        );
        String horasTrabajo = Entrada.getString();
        if (!StringUtils.estaEnBlanco(horasTrabajo)) {
            ((ArtesanoHora) empleadoEditado).setHorasDeTrabajo(Integer.parseInt(horasTrabajo));
        }
    }

    @Override
    public boolean guardarDatos() {
        try {
            Fabrica.MueblesArturo().empleados().guardar(empleadoEditado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void resetCampos() {
        if (empleadoEditado != null) {
            try {
                empleadoEditado = empleadoEditado.getClass().newInstance();
            } catch (Exception e) {
            }
        }
    }

    public Empleado getEmpleadoEditado() {
        return empleadoEditado;
    }

    public void setEmpleadoEditado(Empleado empleadoEditado) {
        this.empleadoEditado = empleadoEditado;
    }
}
