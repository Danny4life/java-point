package com.osiki.javatpoint.jenkov;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClassThree {
    public static void main(String[] args) {
        List<String> dinner = new ArrayList<>();

        dinner.add("beans");
        dinner.add("stone");
        dinner.add("beans");
        dinner.add("stone");
        dinner.add("beans");
        dinner.add("stone");
        dinner.add("beans");
        dinner.add("stone");
        dinner.add("beans");
        dinner.add("stone");
        dinner.add("beans");
        dinner.add("stone");
        dinner.add("beans");
        dinner.add("stone");


        dinner = dinner.stream()
                .filter(stone -> stone.equals("stone"))
                .collect(Collectors.toList());

        System.out.println(dinner);

        List<String> lunch = new ArrayList<>();

        lunch.add("rice");
        lunch.add("stone");
        lunch.add("rice");
        lunch.add("stone");
        lunch.add("rice");
        lunch.add("stone");
        lunch.add("rice");
        lunch.add("stone");
        lunch.add("rice");
        lunch.add("stone");



    }
}
