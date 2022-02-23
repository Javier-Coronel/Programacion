package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Registro {
    private Propiedad[] propiedades;

    public Registro(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }
    public int numeroPropiedades(){
        return propiedades.length;
    }
    public void addPropiedad(Propiedad p){
        propiedades = Arrays.copyOf(propiedades, propiedades.length+1);
        propiedades[propiedades.length-1] = p;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }

    public boolean eliminarPropiedad(Propiedad p){
        if (!(propiedadEsta(this.propiedades, p)) || this.propiedades.length==0)return false;
        else {
            Propiedad[] aux = new Propiedad[this.propiedades.length - 1];
            int aux2 = 0;
            for (int i = 0; i < aux.length; i++) {
                if(p.equals(this.propiedades[i]))aux2 = 1;
                aux[i] = this.propiedades[i + aux2];
            }
            this.propiedades = aux;
        }
        return true;
    }
    public boolean propiedadEsta(Propiedad[] conjunto, Propiedad p){
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i].equals(p))return true;
        }
        return false;
    }
    public void informeSuperficie(){
        Arrays.sort(this.propiedades);
    }
    public void informeAntiguedad(){
        Arrays.sort(this.propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad propiedad, Propiedad t1) {
                if (propiedad.getAñoConstrucción() == t1.getAñoConstrucción()){
                    return propiedad.compareTo(t1);
                }
                return  t1.getAñoConstrucción() - propiedad.getAñoConstrucción();
            }
        });
    }
}
