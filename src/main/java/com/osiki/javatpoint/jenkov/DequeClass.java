package com.osiki.javatpoint.jenkov;

import java.util.Deque;
import java.util.LinkedList;

public class DequeClass {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.add("one");
        deque.add("two");
        deque.add("three");
        deque.add("four");
        deque.addFirst("five");
        deque.addLast("six");


        for(String str : deque){
            System.out.println(str);
        }

        String rem = deque.remove();
        String tail = deque.getLast();

        System.out.println("tail = " + tail);

        System.out.println(rem);

        System.out.println(deque.size());
        System.out.println("peeking = " + deque.peek());
        System.out.println(deque);
    }
}
