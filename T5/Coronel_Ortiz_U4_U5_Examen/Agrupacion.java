package com.company;

import java.util.Comparator;

public abstract class Agrupacion implements Comparable {
    private String nombre;
    private String autor;
    private String autorDeMusica;
    private String autorDeLetras;
    private Disfraz disfraz;
    private static int numeroDeAgrupaciones = 0;
    public Agrupacion(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorDeMusica = autorDeMusica;
        this.autorDeLetras = autorDeLetras;
        this.disfraz = disfraz;
        numeroDeAgrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorDeMusica() {
        return autorDeMusica;
    }

    public void setAutorDeMusica(String autorDeMusica) {
        this.autorDeMusica = autorDeMusica;
    }

    public String getAutorDeLetras() {
        return autorDeLetras;
    }

    public void setAutorDeLetras(String autorDeLetras) {
        this.autorDeLetras = autorDeLetras;
    }

    public Disfraz getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(Disfraz disfraz) {
        this.disfraz = disfraz;
    }

    public static int getNumeroDeAgrupaciones() {
        return numeroDeAgrupaciones;
    }

    abstract void cantar_la_presentacion();
    abstract void hacer_tipo();

    @Override
    public int compareTo(Object o) {
        Agrupacion a = (Agrupacion) o;
        return this.nombre.compareTo(a.nombre);
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorDeMusica='" + autorDeMusica + '\'' +
                ", autorDeLetras='" + autorDeLetras + '\'' +
                ", disfraz=" + disfraz +
                '}';
    }
}
