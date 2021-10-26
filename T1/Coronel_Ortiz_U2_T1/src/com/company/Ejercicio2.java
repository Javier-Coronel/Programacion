package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, cifra, contador = 0, contPos = 1, pos = 0;
        do {
            System.out.println("Pon un numero:");
            num = tec.nextInt();
        }while (num < 0);
        do {
            System.out.println("Pon un numero del 0 al 9");
            cifra = tec.nextInt();
        }while (cifra > 9 || cifra<0);
        while (num > 0){
            if (cifra == num %10){
                contador++;
                pos = pos * 10 + contPos;
            }
            contPos++;
            num /=10;

        }if (contador != 0){
            System.out.println("Hay " + contador + " casos");
            System.out.print("En posiciones: ");
            for (int i = contador; i >= 1; i--) {
                if (i == 1) {
                    System.out.print(pos%10);
                }
                else {
                    System.out.print(pos%10 +"-" );
                }
                pos /=10;
            }
        }else{
            System.out.println("Hay " + contador + " casos");
            System.out.println("En ninguna posicion");
        }

    }
}
