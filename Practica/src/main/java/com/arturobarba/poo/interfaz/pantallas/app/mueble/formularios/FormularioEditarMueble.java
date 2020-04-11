package com.arturobarba.poo.interfaz.pantallas.app.mueble.formularios;

import static com.arturobarba.poo.utils.StringUtils.normalizarFloat;
import static com.arturobarba.poo.utils.StringUtils.normalizarInteger;
import static com.arturobarba.poo.utils.StringUtils.normalizarString;
import com.arturobarba.poo.Fabrica;
import com.arturobarba.poo.interfaz.Entrada;
import com.arturobarba.poo.interfaz.Salida;
import com.arturobarba.poo.interfaz.pantallas.formularios.AbstractFormulario;
import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.artesano.ArtesanoHora;
import com.arturobarba.poo.utils.StringUtils;

public class FormularioEditarMueble extends AbstractFormulario {

    private Mueble muebleEditado;

    public FormularioEditarMueble(Mueble muebleEditado, boolean agregarVarios) {
        super(agregarVarios);
        this.muebleEditado = muebleEditado;
    }

    @Override
    public void mostrarFormulario() {
        if (muebleEditado == null) {
            return;
        }

        if (muebleEditado.getId() == null) {
            Salida.titulo("Creando nuevo mueble");
        } else {
            Salida.titulo("Editando mueble #" + muebleEditado.getId() + " " + muebleEditado.getModelo());
            Salida.println("Si no desea modificar el valor de un campo, déjelo en blanco");
            Salida.separadorFino();
        }

        mostrarCamposComunes();
    }

    private void mostrarCamposComunes() {
        Salida.println(String.format("Modelo (%s):", normalizarString(muebleEditado.getModelo())));
        String modelo = Entrada.getString();
        if (!StringUtils.estaEnBlanco(modelo)) {
            muebleEditado.setModelo(modelo);
        }

        Salida.println(String.format("Precio (%.2f):", normalizarFloat(muebleEditado.getPrecio())));
        Float precio = Entrada.getFloat();
        if (precio != null) {
            muebleEditado.setPrecio(precio);
        }
    }


    @Override
    public boolean guardarDatos() {
        try {
            Fabrica.MueblesArturo().muebles().guardar(muebleEditado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void resetCampos() {
        if (muebleEditado != null) {
            try {
                muebleEditado = muebleEditado.getClass().newInstance();
            } catch (Exception e) {
            }
        }
    }

    public Mueble getMueble() {
        return muebleEditado;
    }

    public void setMueble(Mueble mueble) {
        this.muebleEditado = mueble;
    }
}
