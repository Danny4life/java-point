package com.osiki.javatpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> alp = new ArrayList<>(Arrays.asList("A", "B", "C"));

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Iterator<Integer> iterator = num.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(alp.get(0));

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2,4,6,8,10,12));



        for(int i = 0; i < num1.size(); i++){
            System.out.println(num1.get(i));
        }
    }
}
