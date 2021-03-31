package com;

import java.util.Arrays;
import java.util.List;

public class HighestAndLowest {

    public static void main(String[] args){
        int[] arr = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        highestAndLowest(arr);
    }
    public static void highestAndLowest(int[] arr){
        int largestIndex = 0;
        int smallestIndex = 0;
        int largestNumber = 0;
        int smallestNumber = 0;

        // For loop over lista
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largestNumber) {
                largestIndex = i + 1;
                largestNumber = arr[i];
            } else if (arr[i] < smallestNumber) {
                smallestIndex = i + 1;
                smallestNumber = arr[i];
            }
        }
        //Printer den høyeste nummeret + hva slags plasseing den er på
        System.out.println("Largest index: ");
        System.out.println(largestIndex);
        System.out.println("Largest Number: ");
        System.out.println(largestNumber);

        //Printer den laveste nummeret + hva slags plasseing den er på
        System.out.println("Smallest Number: ");
        System.out.println(smallestNumber);
        System.out.println("Smallest index: ");
        System.out.println(smallestIndex);


    }
}
