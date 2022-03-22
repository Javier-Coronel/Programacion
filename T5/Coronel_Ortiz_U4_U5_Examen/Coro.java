package com.company;

public class Coro extends AgrupacionOficial{
    private int bandurrias;
    private int guitarras;

    public Coro(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz, int puntos, Integrante[] integrantes, int bandurrias, int guitarras) {
        super(nombre, autor, autorDeMusica, autorDeLetras, disfraz, puntos, integrantes);
        this.bandurrias = bandurrias;
        this.guitarras = guitarras;
    }

    public int getBandurrias() {
        return bandurrias;
    }

    public void setBandurrias(int bandurrias) {
        this.bandurrias = bandurrias;
    }

    public int getGuitarras() {
        return guitarras;
    }

    public void setGuitarras(int guitarras) {
        this.guitarras = guitarras;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del coro con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El coro va de " + super.getDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El coro " + super.getNombre() + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" + super.toString() +
                "bandurrias=" + bandurrias +
                ", guitarras=" + guitarras +
                '}';
    }
}
