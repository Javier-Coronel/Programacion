package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double anchura, altura, precio=0;
        String escudo;
        System.out.println("Introduzca la altura");
        altura= tec.nextInt();
        System.out.println("Introduzca la anchura");
        anchura= tec.nextInt();
        tec.nextLine();
        do {
            System.out.println("Bandera con escudo(s/n)");
            escudo= tec.next();
        }while (!(Objects.equals(escudo, "s") || Objects.equals(escudo, "n")));
        System.out.println("Gracias por su compra.Aqui tiene el desglose de su compra");
        precio+=altura*anchura/100;
        System.out.println("Bandera de "+altura*anchura+" cm2: "+ precio+" €");
        switch (escudo){
            case "s":
                System.out.println("Con escudo: 2,50 €");precio+=2.5;break;
            case  "n":
                System.out.println("Sin escudo: 0,00 €");break;
        }
        System.out.println("Gastos de envío: 3,25 €");
        precio+=3.25;
        System.out.println("Total: " + precio + " €");
    }
}
