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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Identificable) {
            if (getId() != null && ((Identificable) o).getId() != null) {
                return getId().equals(((Identificable) o).getId());
            }
        }

        return false;
    }
}
