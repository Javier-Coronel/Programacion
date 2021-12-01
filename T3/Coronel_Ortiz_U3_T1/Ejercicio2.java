package com.company;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [] numero=new int[20];
        int [] cuadrado=new int[20];
        int [] cubo=new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int)(Math.random()*101);
            cuadrado[i]=numero[i]*numero[i];
            cubo[i]=numero[i]*numero[i]*numero[i];
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println((numero[i]+" "+ cuadrado[i]+" "+ cubo[i]));
        }

    }

}
