package com.osiki.javatpoint;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        Set set = map.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
