package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a= tec.nextInt();
        int [][] b=new int[a][a];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j]=(int)(Math.random()*101)+100;
            }
        }
        for (int []row:
             b) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(numPicos(b));
    }
    public static int numPicos(int [][] b){
        int a=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {

                    if (esPico(b[i][j],i,j,b))a++;


            }
        }

        return a;
    }
    public static boolean esPico(int a, int b, int c, int[][]d) {
        int e=b+1;
        int f=c;
        int pico=0, menor=0;

        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
         e=b-1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
         e=b+1;
         f=c+1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
         e=b+1;
         f=c-1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
         e=b-1;
         f=c+1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
         e=b-1;
         f=c-1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
        e=b;
        f=c+1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
        f=c-1;
        if (existe(e,f,d)){
            pico++;
            if (d[e][f]<=a)menor++;
        }
        return pico==menor;
    }
    public static boolean existe(int e, int f, int [][]d){
        return  e>=0&&e<=d.length-1&&f>=0&&f<=d.length-1;
    }
}
