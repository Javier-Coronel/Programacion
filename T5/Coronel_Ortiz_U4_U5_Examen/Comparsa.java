package com.company;

public class Comparsa extends AgrupacionOficial{
    private String empresa;

    public Comparsa(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz, int puntos, Integrante[] integrantes, String empresa) {
        super(nombre, autor, autorDeMusica, autorDeLetras, disfraz, puntos, integrantes);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la comparsa con nombre " + super.getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La comparsa va de " + super.getDisfraz());
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La comparsa " +super.getNombre()+ " va caminito del falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" + super.toString() +
                "empresa='" + empresa + '\'' +
                '}';
    }
}
