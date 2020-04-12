package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.menus;

import com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.PantallaEditarMueble;
import com.arturobarba.poo.interfaz.pantallas.menus.AbstractMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.AccionMenuNavegar;
import com.arturobarba.poo.interfaz.pantallas.menus.ElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SalirElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SeparadorElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.SubTituloElementoMenu;
import com.arturobarba.poo.interfaz.pantallas.menus.TituloElementoMenu;
import com.arturobarba.poo.modelo.mueble.mesa.MesaCafeCristal;
import com.arturobarba.poo.modelo.mueble.mesa.MesaCafeMadera;
import com.arturobarba.poo.modelo.mueble.mesa.MesaDeComedor;
import com.arturobarba.poo.modelo.mueble.mesa.MesaDeDormitorio;
import com.arturobarba.poo.modelo.mueble.silla.SillaCocina;
import com.arturobarba.poo.modelo.mueble.silla.SillaOficinaConRuedas;
import com.arturobarba.poo.modelo.mueble.silla.SillaOficinaSinRuedas;
import com.arturobarba.poo.modelo.mueble.silla.SillaPlegable;
import java.util.Arrays;
import java.util.List;

public class MenuTipoMueble extends AbstractMenu {

    @Override
    public List<ElementoMenu> obtenerElementosMenu() {
       
        return Arrays.asList(
            new TituloElementoMenu("Seleccione un mueble a crear"),
            new SubTituloElementoMenu("Mesas"),
            new ElementoMenu(1, "Mesa de cafe de cristal", new AccionMenuNavegar(new PantallaEditarMueble(new MesaCafeCristal(), true))),
            new ElementoMenu(2, "Mesa de cafe de madera", new AccionMenuNavegar(new PantallaEditarMueble(new MesaCafeMadera(), true))),
            new ElementoMenu(3, "Mesa de comedor", new AccionMenuNavegar(new PantallaEditarMueble(new MesaDeComedor(), true))),
            new ElementoMenu(4, "Mesa de dormitorio", new AccionMenuNavegar(new PantallaEditarMueble(new MesaDeDormitorio(), true))),
            new SeparadorElementoMenu(),
            new SubTituloElementoMenu("Sillas"),
            new ElementoMenu(5, "Silla de oficina con ruedas", new AccionMenuNavegar(new PantallaEditarMueble(new SillaOficinaConRuedas(), true))),
            new ElementoMenu(6, "Silla de oficina sin ruedas", new AccionMenuNavegar(new PantallaEditarMueble(new SillaOficinaSinRuedas(), true))),
            new ElementoMenu(7, "Silla de cocina", new AccionMenuNavegar(new PantallaEditarMueble(new SillaCocina(), true))),
            new ElementoMenu(8, "Silla plegable", new AccionMenuNavegar(new PantallaEditarMueble(new SillaPlegable(), true))),
            new SeparadorElementoMenu(),
            new SalirElementoMenu()
        );
    }
}
