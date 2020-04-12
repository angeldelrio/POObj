package com.arturobarba.poo.interfaz.pantallas.app.gestion.mueble.tablas;

import static com.arturobarba.poo.utils.StringUtils.NO_APLICA;
import static com.arturobarba.poo.utils.StringUtils.normalizarBoolean;
import static com.arturobarba.poo.utils.StringUtils.normalizarEnum;
import static com.arturobarba.poo.utils.StringUtils.normalizarFloat;
import static com.arturobarba.poo.utils.StringUtils.normalizarInteger;
import static com.arturobarba.poo.utils.StringUtils.normalizarString;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.modelo.mueble.Mueble;
import com.arturobarba.poo.modelo.mueble.mesa.Mesa;
import com.arturobarba.poo.modelo.mueble.silla.Silla;
import java.util.ArrayList;
import java.util.List;

public class FilaMueble extends Fila<Mueble> {

    public FilaMueble(Mueble mueble) {
        super(mueble);
    }

    @Override
    public List<String> extraerValores(Mueble mueble) {
        List<String> valores = new ArrayList<>();
        valores.add(normalizarInteger(mueble.getId()));
        valores.add(normalizarEnum(mueble.getTipoMueble()));

        if (mueble instanceof Mesa) {
            valores.add(normalizarEnum(((Mesa) mueble).getTipoMesa()));
            valores.add(NO_APLICA);
            valores.add(NO_APLICA);
        } else if (mueble instanceof Silla) {
            valores.add(normalizarEnum(((Silla) mueble).getTipoSilla()));
            valores.add(normalizarBoolean(((Silla) mueble).tieneRuedas()));
            valores.add(normalizarBoolean(((Silla) mueble).esPlegable()));
        }

        valores.add(normalizarString(mueble.getModelo()));
        valores.add(normalizarEnum(mueble.getMaterial()));
        valores.add(normalizarFloat(mueble.getPrecio()) + "€");

        return valores;
    }
}
