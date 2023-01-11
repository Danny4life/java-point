package com.osiki.javatpoint;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("output.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("done");

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
