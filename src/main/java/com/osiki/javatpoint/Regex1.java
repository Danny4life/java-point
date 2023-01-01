package com.osiki.javatpoint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("ss");
        boolean b = m.matches();

        System.out.println(b);

    }
}
