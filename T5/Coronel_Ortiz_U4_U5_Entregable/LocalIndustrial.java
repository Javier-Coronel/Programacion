package com.company;

import java.util.Calendar;

public class LocalIndustrial extends Local implements MostrarPrecioVenta{
    private int consumoEnergeticoContratado;

    public LocalIndustrial(int añoConstrucción, String dirección, int metrosCuadrados, Persona propietario, int precio, int consumoEnergeticoContratado) {
        super(añoConstrucción, dirección, metrosCuadrados, propietario, precio);
        this.consumoEnergeticoContratado = consumoEnergeticoContratado;
    }

    public int getConsumoEnergeticoContratado() {
        return consumoEnergeticoContratado;
    }

    public void setConsumoEnergeticoContratado(int consumoEnergeticoContratado) {
        this.consumoEnergeticoContratado = consumoEnergeticoContratado;
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" + super.valores() +
                "consumoEnergeticoContratado=" + consumoEnergeticoContratado +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime() + this.getClass().toString() + this.toString());
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un local industrial con un consumo maximo de " + this.getConsumoEnergeticoContratado() + " y valgo: " + this.getPrecio());
    }
}
