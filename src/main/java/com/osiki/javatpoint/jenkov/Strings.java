package com.osiki.javatpoint.jenkov;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String[] str = {"one", "two", "three", "four"};
        StringBuilder sb = new StringBuilder();

        for(String s : str){
            sb.append(s);
        }
        //System.out.println(sb.toString().length());

        String s = "is this right or is this wrong";
        String sub = "is";
        int index = s.indexOf(sub);

//        while(index != -1){
//
//            //System.out.println(index);
//            //index = s.indexOf(sub, index + 1);
//        }

        String st = "a b c d a b";
        boolean ma = st.matches(".*a.*");

        System.out.println(ma);

        String tr = "    he ran over here   ";
        String res = tr.trim();

//        System.out.println(tr);
//        System.out.println(res);

        String spl = "A man drove a car";
        String[] spl1 = spl.split(",");

//        System.out.println(Arrays.toString(spl1));
//        System.out.println(spl.charAt(0));

        String input = "Hello %s";
        String output = String.format("world");

        //System.out.println(output);

        int num = 10;
        for(int i = 0; i < num; i++){
            //System.out.println(i);
        }

        while (num < 20){
            System.out.println(num);
            num++;
        }


    }
}
