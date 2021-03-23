package com;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSum {


    public static void main(String[] args) {

        int []a = {4, 2, 7, 6, -3, -1, -2, 42, 0, -42, 9, -4, 5, -5, -6, -7, -8, -99, 42, 11, 20, 1, 2, 3};
        printSumPairs(a,0);

    }


    public static void printSumPairs(int []input, int k){
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0; i<input.length; i++){

            if(pairs.containsKey(input[i]))
                System.out.println(input[i] +", "+ pairs.get(input[i]));
            else
                pairs.put(k-input[i], input[i]);
        }

    }
}