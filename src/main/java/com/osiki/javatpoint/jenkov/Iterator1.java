package com.osiki.javatpoint.jenkov;

import java.util.*;

public class Iterator1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("four");


        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }


        System.out.println("********************************");

        Set<String> set = new HashSet<>();
        set.add("five");
        set.add("five");
        set.add("six");
        set.add("seven");
        set.add("eight");

        Iterator<String> iterator1 = set.iterator();

        while (iterator1.hasNext()){
            Object obj2 = iterator1.next();

            System.out.println(obj2);
        }

    }

}
