package com.company;

import java.util.Arrays;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Persona a = new Persona("rth", "rth");
        Persona b = new Persona("rth", "rth");
        Persona c = new Persona("rth", "rth");
        Persona[] p = {a,b,c};
        Vivienda vivienda = new Vivienda(109, "arhg", 7,2,3,3,70000, p);
        Persona d = new Persona("rth", "rth");
        Persona e = new Persona("rth", "rth");
        Persona f = new Persona("rth", "rth");
        Persona[] p2 = {d,e,f};
        Vivienda vivienda2 = new Vivienda(3, "arhg", 9,3,4,4,30000, p2);
        Vivienda[] viviendas = {vivienda, vivienda2};
        Arrays.sort(viviendas);
        System.out.println(Arrays.toString(viviendas));
        vivienda.mostrarPropiedad();
        vivienda.mostrarPrecioVenta();
        Propiedad[] propiedades = {vivienda, vivienda2 };
        Registro registro = new Registro(propiedades);
        registro.informeAntiguedad();
        System.out.println(registro);
        registro.informeSuperficie();
        System.out.println(registro);
        LocalComercial localComercial = new LocalComercial(1000, "las casas", 1000,a,1000,"hacer cosas");
        registro.addPropiedad(localComercial);
        registro.informeSuperficie();
        System.out.println(registro);
        registro.eliminarPropiedad(vivienda);
        registro.informeAntiguedad();
        System.out.println(registro);
        localComercial.mostrarPrecioVenta();
        localComercial.mostrarPropiedad();
    }
}
