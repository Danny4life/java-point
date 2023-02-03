package com.osiki.javatpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("mango");
        list.add("banana");
        list.add("carrot");
        list.add("bread");

        System.out.println(list);

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("using for loop:");

        System.out.println("get element: " + list.get(2));

        System.out.println(list.set(2, "bread"));

        System.out.println("sort element");

        Collections.sort(list);

        for(String i : list){
            System.out.println(i);
        }

    }
}
