package com.company;

import java.lang.Math;

public class Ex23 {

    public static void main(String[] args) {

        arrayElementOutput(butterflyArray(5));


    };

    static int[][] butterflyArray (int size) {

        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size - i; j++) {
                result[i][j] = 1;
                result[size - i - 1][size - j - 1] = 1;
            }
        };

        return result;
    };

    static void arrayElementOutput (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\s");
            }
            System.out.println();

        }
    };


}
