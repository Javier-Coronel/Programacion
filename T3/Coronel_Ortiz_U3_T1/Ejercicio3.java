package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca una dimension");
        int longitud= tec.nextInt();
        int [][] n = new int[longitud][longitud];
        int [] m = new int [longitud];
        int max=17, min=66, media=0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j]=(int)(Math.random()*48+18);
                System.out.print(n[i][j]+" ");
                if (i==j){
                    m[i]=(n[i][j]);
                    max=Math.max(max,n[i][j]);
                    min=Math.min(min,n[i][j]);
                    media+=n[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(m));
        System.out.println("Maximo: "+max +". Minimo: "+ min+". Media: "+media/longitud);
    }

}
