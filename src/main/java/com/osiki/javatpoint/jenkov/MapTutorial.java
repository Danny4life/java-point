package com.osiki.javatpoint.jenkov;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTutorial {
    public static void main(String[] args) {
        Map<Integer, String> mapA = new HashMap();
        Map mapB = new TreeMap();


        mapA.put(1, "One");
        mapA.put(2, "two");
        mapA.put(3, "three");
        mapA.put(4, "four");
        mapA.put(5, "five");


        for(Integer i : mapA.keySet()){
            System.out.println("this are key :" + mapA.get(i));
        }

        System.out.println("*******************");

        for(String s : mapA.values()){
            System.out.println("this are values : " + mapA.get(s));
        }

        System.out.println("*******");

        System.out.println("get a key value : " + mapA.get(1));

        for(Map.Entry<Integer, String> mapC : mapA.entrySet()){
            Integer key = mapC.getKey();
            String value = mapC.getValue();

            System.out.println("key : " + key);
            System.out.println("value : " + value);
        }
    }


}
