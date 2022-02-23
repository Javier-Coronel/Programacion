package com.company;

import java.util.Arrays;
import java.util.Calendar;

public class Vivienda extends Propiedad implements Comparable, MostrarPrecioVenta{
    private int banios;
    private int habitaciones;
    private int maxPersonas;
    private int precio;
    private Persona[] personas;

    public Vivienda(int añoConstrucción, String dirección, int metrosCuadrados, int banios, int habitaciones, int maxPersonas, int precio, Persona[] personas) {
        super(añoConstrucción, dirección, metrosCuadrados);
        this.banios = banios;
        this.habitaciones = habitaciones;
        this.maxPersonas = maxPersonas;
        this.precio = precio;
        this.personas = personas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public boolean aniadirPersona(Persona p){
        if (this.personas.length - 1 == this.maxPersonas || personaEsta(personas, p))return false;
        else {
            personas = Arrays.copyOf(personas, personas.length + 1);
            personas[personas.length-1] = p;
        }
        return true;
    }

    public boolean quitarPersona(Persona p){
        if (!personaEsta(personas, p) || this.personas.length==0)return false;
        Persona[] aux = new Persona[this.personas.length-1];
        int aux2 = 0;
        for (int i = 0; i < aux.length; i++) {
            if (!this.personas[i].equals(p))aux[i] = this.personas[i + aux2];
            else aux2 = 1;
        }
        this.personas = aux;
        return true;
    }

    @Override
    public String toString() {
        return "Vivienda{" + super.valores() +
                ", banios=" + banios +
                ", habitaciones=" + habitaciones +
                ", maxPersonas=" + maxPersonas +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime() + this.getClass().toString() + this.toString());
    }

    private boolean personaEsta(Persona[] conjunto, Persona buscado){
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i].equals(buscado))return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Vivienda a = (Vivienda)o;
        return a.habitaciones - this.habitaciones;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una vivienda con capacidad maxima " + this.maxPersonas + " y valgo: " + this.getPrecio());
    }
}
