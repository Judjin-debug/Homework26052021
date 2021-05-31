package com.company;

import java.lang.Math;

public class Ex22 {

    public static void main(String[] args) {

        int[] arr = randomArray(10);
        arrayElementOutput(arr);
        System.out.println();
        arrayElementOutput(arrayFlip(arr));


    };

    static int[] randomArray (int size) {

        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.round(10*Math.random());
        };

        return result;
    };

    static void arrayElementOutput (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\s");
        }
    };

    static int[] arrayFlip (int[] arr) {

        int temp;

        for (int i = 0; i < arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        };

        return arr;

    };

}
