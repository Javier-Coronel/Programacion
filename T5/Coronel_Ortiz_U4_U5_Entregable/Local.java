package com.company;

import java.util.Calendar;

public abstract class Local extends Propiedad{
    private Persona propietario;
    private int precio;

    public Local(int añoConstrucción, String dirección, int metrosCuadrados, Persona propietario, int precio) {
        super(añoConstrucción, dirección, metrosCuadrados);
        this.propietario = propietario;
        this.precio = precio;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Local{" + super.valores() +
                "propietario=" + propietario +
                ", precio=" + precio +
                '}';
    }
    public String valores(){
        return super.valores() +
                "propietario=" + propietario +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime() + this.getClass().toString() + this.toString());
    }
}
