package com.osiki.javatpoint.jenkov;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("element 1");
        queue.offer("element one");

        String ele1 = queue.remove();
        String ele2 = queue.poll();

        System.out.println(ele1);
        System.out.println(ele2);

        Queue<String> queue1 = new LinkedList<>();
        queue1.add("one");
        queue1.add("two");
        queue1.add("three");
        queue1.add("four");

        String rem = queue1.remove();


        System.out.println(rem);
        System.out.println(rem);
        System.out.println(queue1.size());
        System.out.println(queue1.contains("two"));


        if(queue1.contains("two")){
            System.out.println("I am two");
        }else {
            System.out.println("i am false");
        }

        for(String str : queue1){
            System.out.println(str);
        }
    }
}
