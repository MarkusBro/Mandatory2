package com.Oppgave2;


import java.util.Arrays;

/*
    Printer out all consecutive sub-array in the given array thats adds up to zero
 */
public class Oppgave2A {

    public static void main(String[] args) {

        int[] A = new int[]{4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        System.out.println("The given array: " + Arrays.toString(A));
        printAllSubarrays(A);
    }

    public static void printAllSubarrays(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int sum = 0;

            for (int j = i; j < A.length; j++) {

                sum += A[j];

                if (sum == 0) {
                    System.out.println("Subarray [" + i + "…" + j + "]");
                }
            }
        }
    }

}

