package com.osiki.javatpoint;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrayList {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");



        List<String> al2 = new LinkedList<>();
        al2.add("five");
        al2.add("six");
        al2.add("seven");
        al2.add("eight");


        System.out.println(al);
        System.out.println("=======================");
        System.out.println(al2);
    }
}
