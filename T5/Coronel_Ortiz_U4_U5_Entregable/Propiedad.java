package com.company;

import java.util.Objects;

public abstract class Propiedad implements Comparable{
    private int añoConstrucción;
    private String dirección;
    private int metrosCuadrados;

    public Propiedad(int añoConstrucción, String dirección, int metrosCuadrados) {
        this.añoConstrucción = añoConstrucción;
        this.dirección = dirección;
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getAñoConstrucción() {
        return añoConstrucción;
    }

    public void setAñoConstrucción(int añoConstrucción) {
        this.añoConstrucción = añoConstrucción;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public abstract void mostrarPropiedad();

    @Override
    public String toString() {
        return "Propiedad: añoConstrucción=" + añoConstrucción +
                ", dirección='" + dirección + '\'' +
                ", metrosCuadrados=" + metrosCuadrados;
    }

    protected String valores(){
        return "añoConstrucción=" + añoConstrucción +
                ", dirección='" + dirección + '\'' +
                ", metrosCuadrados=" + metrosCuadrados;
    }

    @Override
    public int compareTo(Object o) {
        Propiedad a = (Propiedad)o;
        return this.metrosCuadrados - a.metrosCuadrados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return añoConstrucción == propiedad.añoConstrucción && metrosCuadrados == propiedad.metrosCuadrados && Objects.equals(dirección, propiedad.dirección);
    }

    @Override
    public int hashCode() {
        return Objects.hash(añoConstrucción, dirección, metrosCuadrados);
    }
}
