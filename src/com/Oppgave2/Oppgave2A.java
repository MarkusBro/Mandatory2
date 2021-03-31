package com;

import java.util.*;

public class Oppgave2A {

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        System.out.println("The given array" + Arrays.toString(arr));
        printAllSubArray(arr);

    }

    public static void printAllSubArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    System.out.println("Subarray [" + arr[i] + "..." + arr[j] + "]");
                }
            }
        }


    }

}
