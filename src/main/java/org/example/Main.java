package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        int[] ints = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        String[] string = new String[4];
        string[0] = "Java";
        string[1] = "is";
        string[2] = "the";
        string[3] = "best";

        // Task two
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i < ints.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i]);
            if (i < string.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task three
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = string.length - 1; i >= 0; i--) {
            System.out.print(string[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Task four
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i] = ints[i] + 1;
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}