package com.company;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        int [] a={1,2,4};
        int [] b = {3,4,5,6,7,8};
        System.out.println(Arrays.toString(mediaVectores(b,a)));
    }
    public static float [] mediaVectores(int [] a, int [] b){
        float [] c=new float[Math.max(a.length, b.length)];

        for (int i = 0; i < c.length; i++) {
            if (i<Math.min(a.length, b.length)){
                c[i]=((float)a[i]+(float)b[i])/2;
            }else {
                if (c.length==a.length) c[i]=a[i];
                else c[i]=b[i];
            }
        }
        return c;
    }

}
