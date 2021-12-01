package com.company;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[]a={2,4,4,2,4,6,6,44,5,1,89,8,7,56,4,2,3,54,7};
        int[]b={2,4,6,6,44,5,1};
        System.out.println(Arrays.toString(interseccionVectores(a,b)));
    }
    public static int [] interseccionVectores(int [] a, int [] b){
        int[] c=new int[0];
        for (int i = 0; i < a.length; i++) {
            if (esta(a[i], b)&&!esta(a[i], c)){
                c= Arrays.copyOf(c, c.length+1);
                c[c.length-1]=a[i];
            }
        }
        Arrays.sort(c);
        return c;
    }
    public static boolean esta(int a, int [] b){
        for (int i = 0; i < b.length; i++) {
            if (b[i]==a)return true;
        }
        return false;
    }

}
