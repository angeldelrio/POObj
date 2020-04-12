package com.arturobarba.poo.interfaz.pantallas.app.gestion.cliente.tablas;

import static com.arturobarba.poo.utils.StringUtils.NO_APLICA;
import static com.arturobarba.poo.utils.StringUtils.normalizarInteger;
import static com.arturobarba.poo.utils.StringUtils.normalizarString;
import com.arturobarba.poo.interfaz.pantallas.tablas.Fila;
import com.arturobarba.poo.modelo.persona.cliente.Cliente;
import com.arturobarba.poo.modelo.persona.cliente.ClienteEmpresa;
import com.arturobarba.poo.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class FilaCliente extends Fila<Cliente> {

    public FilaCliente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public List<String> extraerValores(Cliente cliente) {
        List<String> valores = new ArrayList<>();
        valores.add(normalizarInteger(cliente.getId()));
        valores.add(cliente.getClass().getSimpleName());
        valores.add(normalizarString(cliente.getNif()));
        valores.add(normalizarString(cliente.getNombre()));
        valores.add(normalizarString(cliente.getIban()));

        if (cliente instanceof ClienteEmpresa) {
            valores.add(StringUtils.normalizarEnum(((ClienteEmpresa) cliente).getTipoEmpresa()));
        } else {
            valores.add(NO_APLICA);
        }

        return valores;
    }
}
