package com.company;

import java.util.Calendar;

public class EquipamientoServicio extends Propiedad{
    private TipoEquipamientoServicio tipo;

    public EquipamientoServicio(int añoConstrucción, String dirección, int metrosCuadrados, TipoEquipamientoServicio tipo) {
        super(añoConstrucción, dirección, metrosCuadrados);
        this.tipo = tipo;
    }

    public TipoEquipamientoServicio getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamientoServicio tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" + super.valores() +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void mostrarPropiedad() {
        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.getTime() + this.getClass().toString() + this.toString());
    }
}
