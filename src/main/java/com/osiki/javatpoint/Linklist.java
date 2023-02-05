package com.osiki.javatpoint;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

//        al.removeFirst();
//        al.removeLast();

        al.remove("a");

        Iterator<String> itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
