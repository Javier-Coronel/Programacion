package com.company;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int altura, numdElv=1,numEsp;
        do{
            System.out.println("Introduzca la altura:");
            altura= tec.nextInt();
        }while (altura<4);
        numEsp= altura-3;
        int a= numEsp;
        for (int i = 0; i < altura; i++) {
            if (i ==0 ) {
                for (int j = 0; j < a; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else if (i==altura-1) {
                for (int j = 0; j < a; j++) {
                    System.out.print(" ");
                }
                System.out.print("Y");
            }
            else{
                for (int j = 0; j < numEsp; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < numdElv; j++) {
                    if (j== 0||j==(numdElv-1)) System.out.print("^");
                    else if (i==altura-2) System.out.print("^");
                    else System.out.print(" ");
                }
                numdElv+=2;
                numEsp--;

            }
            System.out.println();
        }
    }
}
