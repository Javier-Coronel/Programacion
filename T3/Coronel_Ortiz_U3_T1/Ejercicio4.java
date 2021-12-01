package com.company;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] a = new int[5][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=(int) (Math.random()*100);
            }
        }
        for (int [] row:
             a) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        System.out.println();
        int b = (int)(Math.random()*30);
        int [][] c=desplazarMatriz(a, b);
        System.out.println(b);
        for (int [] row:
                c) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] desplazarMatriz(int[][] a, int b){
        int [][]c=new int[a.length][a[0].length];
        int d=b;
        while (d>=a[0].length){
            d-=a[0].length;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (j+d<a[i].length)c[i][j+d]=a[i][j];
                else c[i][j+d-a[i].length]=a[i][j];
            }
        }
        return c;
    }
}
