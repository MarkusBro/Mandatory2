package com;

public class HighestAndLowest {

    public static void main(String[] args){
        int[] number = new int[] {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        int highest = 0;
        int lowest = 0;

        for (int j : number) {
            if (j > highest) {
                highest = j;
            } else if (j < lowest) {
                lowest = j;
            }

        }
        System.out.println("highest number: " + highest);
        System.out.println("lowest number: " + lowest);
        System.out.println(number[lowest]);
        System.out.println(number[highest]);
        
    }
    public static void highest(int[]arr){

    }
}
