package com.arturobarba.poo.interfaz.pantallas.formularios.cliente;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.interfaz.pantallas.formularios.AbstractFormulario;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.utils.StringUtils;

public class FormularioEditarCliente extends AbstractFormulario {

    private Cliente empleadoEditado;

    public FormularioEditarCliente(Cliente empresaEditada) {
        this.empleadoEditado = empresaEditada;
    }

    @Override
    public void rellenarCampos() {
        if (empleadoEditado.getId() == null) {
            Salida.titulo("Creando nuevo cliente empresa");
        } else {
            Salida.titulo("Editando cliente #" + empleadoEditado.getId() + " " + empleadoEditado.getNombre());
            Salida.println("Si no desea modificar el valor de un campo, déjelo en blanco");
            Salida.separadorFino();
        }

        Entrada.reset();
        Salida.println("Nombre:");
        String nombre = Entrada.getString();
        if (!StringUtils.isBlank(nombre)) {
            empleadoEditado.setNombre(nombre);
        }

        Salida.println("Teléfono:");
        String telefono = Entrada.getString();
        if (!StringUtils.isBlank(telefono)) {
            empleadoEditado.setTelefono(telefono);
        }

        Salida.println("IBAN:");
        String iban = Entrada.getString();
        if (!StringUtils.isBlank(iban)) {
            empleadoEditado.setIban(iban);
        }

        Salida.println("NIF:");
        String nif = Entrada.getString();
        if (!StringUtils.isBlank(nif)) {
            empleadoEditado.setNif(nif);
        }
    }

    @Override
    public boolean guardarDatos() {
        try {
            Fabrica.MueblesArturo().clientes().guardar(empleadoEditado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void resetCampos() {
        empleadoEditado = null;
    }

    public Cliente getEmpleadoEditado() {
        return empleadoEditado;
    }

    public void setEmpleadoEditado(Cliente clienteEditado) {
        this.empleadoEditado = clienteEditado;
    }
}
