package com.company;

public class Integrante {
    private int numero_participante;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int numero_participante, String nombre, int edad, String localidad) {
        this.numero_participante = numero_participante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public int getNumero_participante() {
        return numero_participante;
    }

    public void setNumero_participante(int numero_participante) {
        this.numero_participante = numero_participante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numero_participante=" + numero_participante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
