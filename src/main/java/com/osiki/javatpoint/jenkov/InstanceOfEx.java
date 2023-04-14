package com.osiki.javatpoint.jenkov;

import java.util.HashMap;
import java.util.Map;

public class InstanceOfEx {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        boolean newMap = map instanceof Object;

        System.out.println(newMap);
        System.out.println(iterate(10));


        for(int i = 0, n = 10; i < n; i++){
            //System.out.println(i);
        }

        String[] strings = {"Jack", "Jill", "Andrew", "Beatrice"};
        int wordsStartWithJ = 0;

        for(int i = 0; i < strings.length; i++){
            if(! strings[i].toLowerCase().startsWith("j")){
                continue;
            }
            System.out.println(wordsStartWithJ++);
        }
    }


    public static int iterate(int num){

        int sum = 0;
        for (int i = 0; i < num; i++){


            //System.out.println(i);

        }

        return sum;
    }
}
