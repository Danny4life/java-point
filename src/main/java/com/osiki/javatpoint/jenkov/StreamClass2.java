package com.osiki.javatpoint.jenkov;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass2 {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("one");
        items.add("two");
        items.add("three");
        items.add("four");
        items.add("five");

        items = items.stream()
                .filter(item -> item.startsWith("t"))
                .collect(Collectors.toList());

        System.out.println(items);



        List<String> list = new ArrayList<>();
        list.add("segun");

        list = (List<String>) list.stream()
                .map(li -> li.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
