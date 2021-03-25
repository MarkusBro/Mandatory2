package com;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;

public class CustumeOrder implements Comparable<CustumeOrder>{

    private String name;
    private int number;

    public CustumeOrder(String name, int number){
        this.name = name;
        this.number = number;
    }
    @Override
    public int compareTo(CustumeOrder o) {
        return o.getNumber() < this.getNumber() ? 1: -1;
    }
    public void getHightestPriorityElement(){
    }

    @Override
    public String toString() {
        return "name='" + this.name  + ", number=" + this.number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
	// write your code here


        CustumeOrder c1 = new CustumeOrder("Terje", 5);
        CustumeOrder c2 = new CustumeOrder("Kari", 7);
        CustumeOrder c3 = new CustumeOrder("Nils", 4);
        CustumeOrder c4 = new CustumeOrder("Otto", 8);
        CustumeOrder c5 = new CustumeOrder("Syvert", 7);
        CustumeOrder c6 = new CustumeOrder("lise", 11);
        CustumeOrder c7 = new CustumeOrder("Notto", 0);
        CustumeOrder c8 = new CustumeOrder("Odd", 1);
        CustumeOrder c9 = new CustumeOrder("Even", 2);

        Queue<CustumeOrder> custumeOrders = new PriorityQueue<>();
        custumeOrders.offer(c1);
        custumeOrders.offer(c2);
        custumeOrders.offer(c3);
        custumeOrders.offer(c4);
        custumeOrders.offer(c5);
        custumeOrders.offer(c6);
        custumeOrders.offer(c7);
        custumeOrders.offer(c8);
        custumeOrders.offer(c9);

        while (!custumeOrders.isEmpty()){
            System.out.println(custumeOrders.poll());
        }
        CustumeOrder val = null;
        while ((val = custumeOrders.poll())!= null) {
            System.out.println(val);
            System.out.println("halla");
        }
        CustumeOrder val2 = Collections.max(custumeOrders);
        System.out.println(val2);
    }


}
