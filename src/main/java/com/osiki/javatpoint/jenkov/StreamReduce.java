package com.osiki.javatpoint.jenkov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamReduce {

    public static void main(String[] args) {
        List<Integer> reducer = new ArrayList<>();
        reducer.add(10);
        reducer.add(10);
        reducer.add(10);
        reducer.add(10);
        reducer.add(10);

        reducer = Collections.singletonList(reducer.stream()
                .reduce((acc, item) -> Integer.valueOf(acc + " " + item))
                .get());


        System.out.println(reducer);

    }
}
