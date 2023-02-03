package com.osiki.javatpoint;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("segun");
        set.add("zoe");
        set.add("segun");
        set.add("moses");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        LinkedHashSet<String> link = new LinkedHashSet<String>();

        link.add("segun");
        link.add("zoe");
        link.add("segun");
        link.add("moses");

        Iterator<String> itr2 = link.iterator();

        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
