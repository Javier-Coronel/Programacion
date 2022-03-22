package com.company;

import java.util.Arrays;
import java.util.Objects;

public abstract class AgrupacionOficial extends Agrupacion{
    private int puntos;

    public AgrupacionOficial(String nombre, String autor, String autorDeMusica, String autorDeLetras, Disfraz disfraz, int puntos, Integrante[] integrantes) {
        super(nombre, autor, autorDeMusica, autorDeLetras, disfraz);
        this.puntos = puntos;
        this.integrantes = integrantes;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    private Integrante[] integrantes= new Integrante[0];
    void insertar_integrante(Integrante i){
        Integrante[] aux = Arrays.copyOf(this.integrantes, this.integrantes.length+1);
        aux[aux.length-1] = i;
        this.integrantes = aux;
    }
    boolean eliminar_integrante(Integrante i){
        Integrante[] aux = new Integrante[this.integrantes.length];
        int a = 0;
        int b = this.integrantes.length;
        for (int j = 0; j < this.integrantes.length; j++) {
            if (i.equals(this.integrantes[j])){
                aux = Arrays.copyOf(aux, aux.length-1);
                a++;
            }else {
                aux[j - a] = this.integrantes[j];
            }
        }
        integrantes = aux;
        return !(b == this.integrantes.length);
    }
    abstract void caminito_del_falla();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgrupacionOficial that = (AgrupacionOficial) o;
        return puntos == that.puntos && Arrays.equals(integrantes, that.integrantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(puntos);
        result = 31 * result + Arrays.hashCode(integrantes);
        return result;
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" + super.toString() +
                "puntos=" + puntos +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}';
    }
}
