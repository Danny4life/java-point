package com.osiki.javatpoint;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("text1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("welcome to javapoint");
        bw.close();
        System.out.println("success");
    }
}
