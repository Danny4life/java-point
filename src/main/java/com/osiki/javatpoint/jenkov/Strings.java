package com.osiki.javatpoint.jenkov;

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

        System.out.println(tr);
        System.out.println(res);


    }
}
