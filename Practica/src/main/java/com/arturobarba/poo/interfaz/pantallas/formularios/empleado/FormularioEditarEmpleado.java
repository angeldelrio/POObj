package com.arturobarba.poo.interfaz.pantallas.formularios.empleado;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.interfaz.pantallas.formularios.AbstractFormulario;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.utils.StringUtils;

public class FormularioEditarEmpleado extends AbstractFormulario {

    private Empleado empleadoEditado;

    public FormularioEditarEmpleado(Empleado empleadoEditado) {
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
        Salida.println("Nombre:");
        String nombre = Entrada.getString();
        if (!StringUtils.isBlank(nombre)) {
            empleadoEditado.setNombre(nombre);
        }

        Salida.println("Horas contrato:");
        String horasContrato = Entrada.getString();
        if (!StringUtils.isBlank(horasContrato)) {
            empleadoEditado.setHorasContrato(Integer.parseInt(horasContrato));
        }

        Salida.println("Salario:");
        String salario = Entrada.getString();
        if (!StringUtils.isBlank(salario)) {
            empleadoEditado.setSalario(Integer.parseInt(salario));
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
        empleadoEditado = null;
    }

    public Empleado getEmpleadoEditado() {
        return empleadoEditado;
    }

    public void setEmpleadoEditado(Empleado empleadoEditado) {
        this.empleadoEditado = empleadoEditado;
    }
}