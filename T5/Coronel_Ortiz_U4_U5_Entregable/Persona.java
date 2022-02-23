package com.company;

import java.util.Objects;

public class Persona {
    private String nif;
    private String nombreYApellidos;
    private int id;
    private static int numeroDeId = 0;

    public Persona(String nif, String nombreYApellidos) {
        this.nif = nif;
        this.nombreYApellidos = nombreYApellidos;
        this.id = numeroDeId++;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nif='" + nif + '\'' +
                ", nombreYApellidos='" + nombreYApellidos + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id && nif.equals(persona.nif) && nombreYApellidos.equals(persona.nombreYApellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombreYApellidos, id);
    }


}
