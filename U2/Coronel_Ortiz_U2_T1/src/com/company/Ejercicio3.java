package com.company;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int entradas;
        float descuento=0, precioIndv = 0;
        String tarjeta;
        String dia;
        do {
            System.out.println("numero de entradas: ");
            entradas = tec.nextInt();
        }while (entradas <=0);
        System.out.println("Tiene tarjeta (s/n):");
        tarjeta = tec.next();
        System.out.println("Dia de la semana");
        dia = tec.next();
        if (tarjeta.equals("s")) {
            descuento = 0.1f;
        }
        switch (dia){
            case "lunes":
            case "martes":
            case "viernes":
            case "sabado":
            case "domingo":
                System.out.println("Entradas individuales: " + entradas);
                System.out.println("Precio por cada entrada: 8");
                System.out.println("Total: " + entradas*8);
                System.out.println("Descuento: " + (entradas*8*descuento));
                System.out.println("A pagar: " + entradas * 8 * (1-descuento));
                break;
            case "miercoles":
                System.out.println("Entradas individuales: " + entradas);
                System.out.println("Precio por cada entrada: 5");
                System.out.println("Total: " + entradas*5);
                System.out.println("Descuento: " + (entradas*5*descuento));
                System.out.println("A pagar: " + entradas * 5 * (1-descuento));
                break;

            case "jueves":
                System.out.println("Entradas pareja: " + entradas/2);
                System.out.println("Precio por cada entrada de pareja: 11");
                if (entradas%2==1) {
                    System.out.println("Entradas individuales: 1");
                    System.out.println("Precio por cada entrada individual: 8");
                    precioIndv = 8;
                }
                System.out.println("Total: " + (((entradas/2)*11)+precioIndv));

                System.out.println("Descuento: " + ((entradas/2*11+precioIndv)*descuento));
                System.out.println("A pagar: " + (entradas/2 * 11 + precioIndv) * (1-descuento) );
                break;

            default:
                System.out.println("Dia mal puesto");
                break;
        }
    }
}
