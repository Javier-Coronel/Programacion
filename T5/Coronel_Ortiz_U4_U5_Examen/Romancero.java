package com.company;

public class Romancero extends Agrupacion implements Callejera{
    private String tematica;

    public Romancero(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz, String tematica) {
        super(nombre, autor, autorDeMusica, autorDeLetras, disfraz);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del romancero con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El romancero va de " + super.getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Romanero " + super.getNombre());
    }

    @Override
    public String toString() {
        return "Romancero{" + super.toString() +
                "tematica='" + tematica + '\'' +
                '}';
    }
}
