package com.company;

import java.lang.Math;

public class Ex18 {

    public static void main(String[] args) {

        arrayLastElementOutput(randomArray(10));


    };

    static int[] randomArray (int size) {

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.round(10*Math.random());
        };

        return result;
    };

    static void arrayLastElementOutput (int[] array) {
        System.out.println("Last element of generated array is " + array[array.length - 1]);
    };

}
