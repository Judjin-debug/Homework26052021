package com.company;

import java.lang.Math;

public class Ex19 {

    public static void main(String[] args) {

        arrayEvenElementOutput(randomArray(10));


    };

    static int[] randomArray (int size) {

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.round(10*Math.random());
        };

        return result;
    };

    static void arrayEvenElementOutput (int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + "\s");
        }
    };

}