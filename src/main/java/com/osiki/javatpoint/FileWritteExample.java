package com.osiki.javatpoint;

import java.io.FileWriter;

public class FileWritteExample {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("text.txt");
            fw.write("i LOVE java");
            fw.close();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("success");
        }
    }
}
