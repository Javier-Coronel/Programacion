package com.company;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private int miembros;

    public Cuarteto(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz, int puntos, Integrante[] integrantes, int miembros) {
        super(nombre, autor, autorDeMusica, autorDeLetras, disfraz, puntos, integrantes);
        this.miembros = miembros;
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del cuarteto con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El cuarteto va de " + super.getDisfraz());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Cuarteto " + super.getNombre());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("El cuarteto " + super.getNombre() + " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Cuarteto{" + super.toString() +
                "miembros=" + miembros +
                '}';
    }
}
