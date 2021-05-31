package com.company;

import java.lang.Math;

public class Ex20 {

    public static void main(String[] args) {

        arrayMaxElementOutput(randomArray(10));


    };

    static int[] randomArray (int size) {

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.round(10*Math.random());
        };

        return result;
    };

    static void arrayMaxElementOutput (int[] array) {
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
        };
        System.out.println("Max element is " + max + ", the index is " + maxIndex);
    };

}