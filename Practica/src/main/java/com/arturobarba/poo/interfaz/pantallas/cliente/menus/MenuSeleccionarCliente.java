package com.arturobarba.poo.interfaz.pantallas.cliente.menus;

import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.pantallas.cliente.formularios.FormularioEditarCliente;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

public class MenuSeleccionarCliente extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        List<ElementoMenu> elementos = new ArrayList<>();
        elementos.add(new TituloElementoMenu("Seleccione un cliente a editar"));

        List<Cliente> empleados = Fabrica.MueblesArturo().clientes().listar();
        for (Cliente cliente : empleados) {
            elementos.add(new ElementoMenu(cliente.getId(), cliente.toString(), new AccionMenuNavegar(new FormularioEditarCliente(cliente, false))));
        }

        elementos.add(new SeparadorElementoMenu());
        elementos.add(new SalirElementoMenu());

        return elementos;
    }
}
