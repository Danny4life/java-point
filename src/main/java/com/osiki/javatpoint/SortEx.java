package com.osiki.javatpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortEx {

    public static void main(String[] args) {
        List<String> ar = new ArrayList<String>();

        ar.add("one");
        ar.add("two");
        ar.add("theww");
        ar.add("four");

        Collections.sort(ar);

        Iterator itr = ar.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
