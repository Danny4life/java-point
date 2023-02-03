package com.osiki.javatpoint;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("segun osiki");
        queue.add("zoe osiki");
        queue.add("segun");
        queue.add("osiki");

        System.out.println("head: " + queue.element());
        System.out.println("head: " + queue.peek());
        System.out.println("Iterating the queue elements");

        Iterator itr = queue.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("after removing two elements");

        Iterator<String> itr2 = queue.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }




    }
}
