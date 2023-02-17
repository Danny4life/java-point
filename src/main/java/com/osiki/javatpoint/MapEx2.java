package com.osiki.javatpoint;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getValue());
        }

    }



}
