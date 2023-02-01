package com.osiki.javatpoint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TestJavaCollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("joe");
        list.add("jane");
        list.add("doe");
        list.add("deyes");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Stack<String> st = new Stack<String>();

        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");
        st.push("e");

        st.pop();

        Iterator it = st.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
