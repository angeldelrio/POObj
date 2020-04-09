package com.arturobarba.poo.modelo;

public abstract class Identificable {
    private Integer id;

    public Identificable() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("#%s", getId());
    }
}
