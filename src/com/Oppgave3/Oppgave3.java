package com;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Oppgave3 {

    public static void main(String[] args) {
	// write your code here
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Deque<Integer> list = new ArrayDeque<>();

        list.addAll(number);

        System.out.println("Alle tall fra 1 til 20");

        for (int i : list){
            System.out.println(i);
        }
        list.pollLast(); //StackPoll
        list.poll(); //QueuePoll
        list.pollLast(); //StackPoll
        list.pollLast(); //StackPoll
        list.poll(); //QueuePoll

        System.out.println("Lista etter StackPop, QueuePop, StackPop, StackPop, QueuePop: ");

        for (int i : list){
            System.out.println(i);
        }

    }
}
