package com.Oppgave4;

import java.util.*;

public class Element implements Comparable<Element> {

    private final String name;
    private final int priority;

    public Element(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Element e) {
        return e.getPriority() < this.getPriority() ? 1 : -1;
    }

    @Override
    public String toString() {
        return "name = " + this.name + ", priority = " + this.priority;
    }

    public int getPriority() {
        return priority;
    }

    public static void main(String[] args) {
        // write your code here
        Element c1 = new Element("Terje", 5);
        Element c2 = new Element("Kari", 7);
        Element c3 = new Element("Nils", 4);
        Element c4 = new Element("Otto", 8);
        Element c5 = new Element("Syvert", 7);
        Element c6 = new Element("lise", 11);
        Element c7 = new Element("Notto", 0);
        Element c8 = new Element("Odd", 1);
        Element c9 = new Element("Even", 2);

        PriorityQueue<Element> elements = new PriorityQueue<>();
        elements.offer(c1);
        elements.offer(c2);
        elements.offer(c3);
        elements.offer(c4);
        elements.offer(c5);
        elements.offer(c6);
        elements.offer(c7);
        elements.offer(c8);
        elements.offer(c9);

        while (!elements.isEmpty()) {
            System.out.println(elements.poll());
        }
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Queue<Integer> pg = new PriorityQueue<>(Collections.reverseOrder());
        pg.addAll(list);
        System.out.println("Highest element => " + pg.peek());
    }


}
