package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.menus;

import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.PantallaListadoMueble;
import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.PantallaMenuTipoMueble;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import java.util.Arrays;
import java.util.List;

public class MenuGestionMueble extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
        return Arrays.asList(
            new TituloElementoMenu("Gestión muebles"),
            new ElementoMenu(1, "Crear mueble", new AccionMenuNavegar(new PantallaMenuTipoMueble())),
            new ElementoMenu(2, "Listar muebles", new AccionMenuNavegar(new PantallaListadoMueble())),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }

}
