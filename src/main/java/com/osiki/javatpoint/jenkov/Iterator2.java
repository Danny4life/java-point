package com.osiki.javatpoint.jenkov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator2 {

    public static void main(String[] args) {

        String res = "";
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String value = iterator.next();

            if (value.equals("123")){
                iterator.remove();
                System.out.println(value);
            }

            System.out.println(value);
        }

        List<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("Jenny");
        names.add("Jude");

        Iterator<String> it = names.iterator();

        it.forEachRemaining((ele) ->{
            System.out.println(ele);
        });

        System.out.println("*************");
        ListIterator<String> li = names.listIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("*************");
        while (li.hasPrevious()){
            res = li.previous();
            System.out.println(res);
        }


        System.out.println("########");

        for(String e : list){
            System.out.println(e.toString());
        }


        for(int i = 0; i < list.size(); i++){
            Object ob = list.get(i);

            System.out.println(ob);
        }


    }
}
