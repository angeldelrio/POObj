package com.arturobarba.poo.interfaz.pantallas.cliente.formularios;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.interfaz.pantallas.formularios.AbstractFormulario;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.Menu;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa.TipoEmpresa;
import com.arturobarba.poo.utils.StringUtils;
import java.util.Arrays;
import java.util.List;

public class FormularioEditarCliente extends AbstractFormulario {

    private Cliente clienteEditado;

    public FormularioEditarCliente(Cliente clienteEditado, boolean agregarVarios) {
        super(agregarVarios);
        this.clienteEditado = clienteEditado;
    }

    @Override
    public void rellenarCampos() {
        if (clienteEditado.getId() == null) {
            Salida.titulo("Creando nuevo cliente " + StringUtils.normalizarEnum(clienteEditado.getTipoCliente()));
        } else {
            Salida.titulo("Editando cliente " + StringUtils.normalizarEnum(clienteEditado.getTipoCliente()) + " #" + clienteEditado.getId() + " " + clienteEditado.getNombre());
            Salida.println("Si no desea modificar el valor de un campo, déjelo en blanco");
            Salida.separadorFino();
        }

        Entrada.reset();
        rellenarCamposComunes();

        if (clienteEditado instanceof ClienteEmpresa) {
            Menu menuTipoEmpresa = new AbstractMenu() {
                @Override
                public List<ElementoMenu> obtenerElementosMenu() {
                    return Arrays.asList(
                        new ElementoMenu(1, "Minorista", null),
                        new ElementoMenu(2, "Mayorista", null)
                    );
                }
            };

            menuTipoEmpresa.mostrar();
            ElementoMenu elementoMenuSeleccionado = menuTipoEmpresa.getElementoMenuSeleccionado();
            ((ClienteEmpresa) clienteEditado).setTipoEmpresa(TipoEmpresa.values()[elementoMenuSeleccionado.getNumOpcion() - 1]);
            menuTipoEmpresa.salir();
        }
    }

    private void rellenarCamposComunes() {
        Salida.println("Nombre:");
        String nombre = Entrada.getString();
        if (!StringUtils.estaEnBlanco(nombre)) {
            clienteEditado.setNombre(nombre);
        }

        Salida.println("IBAN:");
        String iban = Entrada.getString();
        if (!StringUtils.estaEnBlanco(iban)) {
            clienteEditado.setIban(iban);
        }

        Salida.println("NIF:");
        String nif = Entrada.getString();
        if (!StringUtils.estaEnBlanco(nif)) {
            clienteEditado.setNif(nif);
        }
    }

    @Override
    public boolean guardarDatos() {
        try {
            Fabrica.MueblesArturo().clientes().guardar(clienteEditado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void resetCampos() {
        clienteEditado = null;
    }

    public Cliente getClienteEditado() {
        return clienteEditado;
    }

    public void setClienteEditado(Cliente clienteEditado) {
        this.clienteEditado = clienteEditado;
    }
}
