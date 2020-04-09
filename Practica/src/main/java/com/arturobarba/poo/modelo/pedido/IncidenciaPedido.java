package com.arturobarba.poo.modelo.pedido;

import com.arturobarba.poo.modelo.persona.empleado.artesano.Artesano;

public class IncidenciaPedido {
    private Artesano artesano;
    private String descripcion;

    public Artesano getArtesano() {
        return artesano;
    }

    public void setArtesano(Artesano artesano) {
        this.artesano = artesano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
