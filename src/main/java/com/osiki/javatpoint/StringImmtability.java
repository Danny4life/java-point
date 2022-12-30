package com.osiki.javatpoint;

public class StringImmtability {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 20;

        char ch = 'a';

        String repl = "Java is a fun, Java is cool";
        String repl1 = repl.replace("Java", "");

        String s = String.valueOf(num);
        String s1 = String.valueOf(num1);

        System.out.println(num + num1);
        System.out.println(s + s1);

        System.out.println(ch);
        System.out.println(repl1);




    }
}
