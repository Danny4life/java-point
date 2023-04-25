package com.osiki.javatpoint.jenkov;

import java.util.*;

public class Binarysearch {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("four");
        list.add("five");
        list.add("five");


        Set<String> set = new HashSet<>();
        set.addAll(list);

        String[] str = list.toArray(new String[0]);

        System.out.println("array :" + str);

        System.out.println(set);

        Collections.sort(list);

        int index = Collections.binarySearch(list, "five");

        System.out.println(list.size());
        System.out.println(index);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("one"));
        System.out.println(list.lastIndexOf("five"));
        System.out.println(list.contains("three"));
        System.out.println(list.contains("six"));

        if(list.contains("two")){
            System.out.println("yayyyyy");
        }else{
            System.out.println("Nahhhhh");
        }


        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
