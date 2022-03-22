package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class COAC {
    private AgrupacionOficial[] agrupacionOficials;

    public COAC(AgrupacionOficial[] agrupacionOficials) {
        this.agrupacionOficials = agrupacionOficials;
    }

    public AgrupacionOficial[] getAgrupacionOficials() {
        return agrupacionOficials;
    }

    public void setAgrupacionOficials(AgrupacionOficial[] agrupacionOficials) {
        this.agrupacionOficials = agrupacionOficials;
    }

    void inscribir_agrupacion(AgrupacionOficial agrupacion){
        AgrupacionOficial[] aux = Arrays.copyOf(this.agrupacionOficials, this.agrupacionOficials.length+1);
        aux[aux.length-1] = agrupacion;
        this.agrupacionOficials = aux;
    }
    boolean eliminar_agrupacion(AgrupacionOficial i){
        AgrupacionOficial[] aux = new AgrupacionOficial[this.agrupacionOficials.length];
        int a = 0;
        int b = this.agrupacionOficials.length;
        for (int j = 0; j < this.agrupacionOficials.length; j++) {
            if (i.equals(this.agrupacionOficials[j])){
                aux = Arrays.copyOf(aux, aux.length-1);
                a++;
            }else {
                aux[j - a] = this.agrupacionOficials[j];
            }
        }
        agrupacionOficials = aux;
        return !(b == this.agrupacionOficials.length);
    }
    void ordenar_por_puntos(){
        Arrays.sort(agrupacionOficials, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial agrupacionOficial, AgrupacionOficial t1) {
                return t1.getPuntos() - agrupacionOficial.getPuntos();
            }
        });
    }
    void ordenar_por_nombre(){
        Arrays.sort(agrupacionOficials);
    }
    void ordenar_por_autor(){
        Arrays.sort(agrupacionOficials, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial agrupacionOficial, AgrupacionOficial t1) {
                return agrupacionOficial.getAutor().compareTo(t1.getAutor());
            }
        });
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupacionOficials=" + Arrays.toString(agrupacionOficials) +
                '}';
    }
}
