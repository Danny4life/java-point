package com.osiki.javatpoint.jenkov;

import java.util.ArrayList;
import java.util.List;

public class Iterator3 {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);


        for(int n : num){
            System.out.println(n);
        }
    }
}
