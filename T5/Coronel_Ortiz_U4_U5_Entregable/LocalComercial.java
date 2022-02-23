package com.company;

import java.util.Calendar;

public class LocalComercial extends Local implements MostrarPrecioVenta{
    private String descripcion;

    public LocalComercial(int añoConstrucción, String dirección, int metrosCuadrados, Persona propietario, int precio, String descripcion) {
        super(añoConstrucción, dirección, metrosCuadrados, propietario, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "LocalComercial{" + super.valores() +
                "descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime() + this.getClass().toString() + this.toString());
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un local comercial que me dedico a " + this.getDescripcion() + " y valgo: " + this.getPrecio());
    }
}
