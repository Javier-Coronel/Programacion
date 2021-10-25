package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numEsp,num;
        do {
            System.out.println("Pon una altura");
            num = tec.nextInt();
        }while (num%2==0||num<3);

        numEsp = num - 1;
        for (int i = 0; i < num; i++) {
            if (i == 0 || i == num-1) {
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                System.out.print("   ");
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j < numEsp; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < num+2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            numEsp--;
            System.out.println();
        }
    }
}
