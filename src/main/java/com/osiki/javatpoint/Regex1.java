package com.osiki.javatpoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[1-10[21-26]]");
        Matcher m = p.matcher("23");
        boolean b = m.matches();

        boolean b1 = Pattern.matches("[abc]+", "a");

        boolean b2 = Pattern.matches("[a-zA-Z0-9]", "A");
        boolean b3 = Pattern.matches("[789]{1}[0-9]{9}", "3982345123");

        System.out.println(b3);

    }
}
