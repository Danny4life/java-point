package com.osiki.javatpoint;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {

        String[] str = {"hello", "hello", "hello"};
        FileWriter fw = new FileWriter("text1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Arrays.toString(str));
        bw.close();
        System.out.println("success more");
    }
}
