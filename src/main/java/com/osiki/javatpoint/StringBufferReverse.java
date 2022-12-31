package com.osiki.javatpoint;

public class StringBufferReverse {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static String reverse(String str){
        StringBuffer sb = new StringBuffer(str);

        return sb.reverse().toString();


    }

}
