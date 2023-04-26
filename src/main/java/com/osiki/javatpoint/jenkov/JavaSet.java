package com.osiki.javatpoint.jenkov;

import java.util.*;

public class JavaSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        Set<String> set1 = new LinkedHashSet<>(set);
        List<String> li = new ArrayList<>();

        li.addAll(set);

        System.out.println("list is : " + li);

        System.out.println("this is linkset: " + set1);

        Iterator<String> it = set1.iterator();

        while (it.hasNext()){
            String value = it.next();

            System.out.println(value);
        }
    }
}
