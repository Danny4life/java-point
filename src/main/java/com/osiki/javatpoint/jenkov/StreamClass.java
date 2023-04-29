package com.osiki.javatpoint.jenkov;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("one");
        items.add("two");
        items.add("three");
        items.add("four");


        Stream<String> str = items.stream();

        System.out.println("*********");

       str.forEach((item) -> {
           System.out.println(item);
       });

       Stream<String> st = items.stream();

       items = st.filter(it -> it.startsWith("t"))
               .collect(Collectors.toList());

        System.out.println(items);

    }
}
