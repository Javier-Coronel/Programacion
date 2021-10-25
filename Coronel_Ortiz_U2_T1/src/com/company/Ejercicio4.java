package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, cont= 0;
        String n;
        do {
            System.out.println("Pon un numero de cifras pares");
            num = tec.nextInt();
            n = Integer.toString(num);
        }while (n.length()%2!=0);
        while (num>0){
            cont = 0;
            for (int i = 1; i < num%100; i++) {
                if ((num%100)%i==0){
                    cont++;
                }
            }
            if (cont == 1){
                System.out.println(num%100 + " - Es un numero primo");
            }else {
                System.out.println(num%100 + " - No es un numero primo");
            }
            num/=100;
        }
    }
}
