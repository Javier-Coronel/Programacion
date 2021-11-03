package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, numInvers=0, cifras=0;
        System.out.println("Introduzca un numero:");
        num= tec.nextInt();
        System.out.println("El numero " +num+" traducido al sistema de asteriscos es:");
        while (num>0){
            numInvers = numInvers*10+num%10;
            num/=10;
            cifras++;
        }
        while (numInvers>0){
            for (int i = 0; i < numInvers%10; i++) {
                System.out.print("*");
            }
            numInvers/=10;
            cifras--;
            if (cifras>0) System.out.print("_");

        }
    }
}
