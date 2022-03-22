package com.company;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private int cuples;

    public Chirigota(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz, int puntos, Integrante[] integrantes, int cuples) {
        super(nombre, autor, autorDeMusica, autorDeLetras, disfraz, puntos, integrantes);
        this.cuples = cuples;
    }

    public int getCuples() {
        return cuples;
    }

    public void setCuples(int cuples) {
        this.cuples = cuples;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Chirigota va de " + super.getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota " + super.getNombre());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La chirigota " +super.getNombre()+ " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Chirigota{" + super.toString() +
                "cuples=" + cuples +
                '}';
    }
}
