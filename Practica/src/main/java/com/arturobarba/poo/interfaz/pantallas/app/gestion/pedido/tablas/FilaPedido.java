package com.arturobarba.poo.interfaz.pantallas.app.gestion.pedido.tablas;

import static com.arturobarba.poo.utils.StringUtils.normalizarEnum;
import static com.arturobarba.poo.utils.StringUtils.normalizarFloat;
import static com.arturobarba.poo.utils.StringUtils.normalizarInteger;
import static com.arturobarba.poo.utils.StringUtils.normalizarString;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.modelo.pedido.Pedido;
import java.util.ArrayList;
import java.util.List;

public class FilaPedido extends Fila<Pedido> {

    public FilaPedido(Pedido pedido) {
        super(pedido);
    }

    @Override
    public List<String> extraerValores(Pedido pedido) {
        List<String> valores = new ArrayList<>();
        valores.add(normalizarInteger(pedido.getId()));
        valores.add(normalizarEnum(pedido.getEstado()));
        valores.add(normalizarString(pedido.getCliente().getNif()) + " " + normalizarString(pedido.getCliente().getNombre()));

        if (pedido.getComercial() != null) {
            valores.add(normalizarString(pedido.getComercial().getNombre()));
        } else {
            valores.add("Sin asignar");
        }

        valores.add(normalizarInteger(pedido.getMuebles().size()));
        valores.add(normalizarFloat(pedido.getImporte()));
        valores.add(normalizarFloat(pedido.getImporteIva()));

        if (pedido.getImporte() != null) {
            valores.add(
                normalizarFloat(
                    pedido.getImporte() + (pedido.getImporteIva() != null ? pedido.getImporteIva(): 0)
                )
            );
        } else {
            valores.add("");
        }

        return valores;
    }
}
