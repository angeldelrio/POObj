package com.arturobarba.poo.interfaz.pantallas.app.gestion.empleado.tablas;

import static com.arturobarba.poo.utils.StringUtils.NO_APLICA;
import static com.arturobarba.poo.utils.StringUtils.normalizarInteger;
import static com.arturobarba.poo.utils.StringUtils.normalizarString;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.modelo.pedido.Pedido;
import com.arturobarba.poo.modelo.persona.empleado.Empleado;
import com.arturobarba.poo.modelo.persona.empleado.artesano.Artesano;
import java.util.ArrayList;
import java.util.List;

public class FilaEmpleado extends Fila<Empleado> {

    public FilaEmpleado(Empleado modelo) {
        super(modelo);
    }

    @Override
    public List<String> extraerValores(Empleado modelo) {
        List<String> valores = new ArrayList<>();
        valores.add(normalizarInteger(modelo.getId()));
        valores.add(modelo.getClass().getSimpleName());
        valores.add(normalizarString(modelo.getNif()));
        valores.add(normalizarString(modelo.getNombre()));
        valores.add(normalizarInteger(modelo.getSalario()) + "€");

        if (modelo instanceof Artesano) {
            Pedido pedidoAsignado = ((Artesano) modelo).getPedidoAsignado();
            valores.add(pedidoAsignado == null ? "Ninguno" : normalizarInteger(pedidoAsignado.getId()));
        } else {
            valores.add(NO_APLICA);
        }

        return valores;
    }
}
