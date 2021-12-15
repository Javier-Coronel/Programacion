package com.company;

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        int [] v={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(insertarValor(v, 10, 2)));
    }
    public static int [] insertarValor(int [] v, int valor, int pos){
        int [] resultado= new int[v.length+1];
        if (pos>=0&&pos< resultado.length){
            for (int i = 0; i < resultado.length; i++) {
                    if (i < pos) resultado[i] = v[i];
                    else if (i == pos) resultado[i] = valor;
                    else resultado[i] = v[i - 1];
            }
        }
        return resultado;
    }
}
