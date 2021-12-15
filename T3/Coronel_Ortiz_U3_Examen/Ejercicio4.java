package com.company;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] a= new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=(int)(Math.random()*100);
            }
        }
        int [][]b= eliminarFilasImpares(a);
        int [][]c=eliminarFilasPares(a);
        for (int [] row:
             a) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        for (int [] row:
                b) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
        for (int [] row:
                c) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] eliminarFilasPares(int[][] matriz){
        int [][]soloPares=new int[matriz.length/2][matriz[0].length];
        for (int i = 0; i < soloPares.length; i++) {
            for (int j = 0; j < soloPares[0].length; j++) {
                soloPares[i][j]=matriz[i*2+1][j];
            }
        }
        return soloPares;
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        int a=0;
        if (matriz.length%2!=0)a++;
        int [][]soloImpares=new int[matriz.length/2+a][matriz[0].length];
        for (int i = 0; i < soloImpares.length; i++) {
            for (int j = 0; j < soloImpares[0].length; j++) {
                soloImpares[i][j]=matriz[i*2][j];
            }
        }
        return soloImpares;
    }
}
