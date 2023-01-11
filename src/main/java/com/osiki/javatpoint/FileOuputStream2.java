package com.osiki.javatpoint;

import java.io.FileOutputStream;

public class FileOuputStream2 {
    public static void main(String[] args) {
        try {
            FileOutputStream four = new FileOutputStream("/Users/decagon/Desktop/test.txt");
            String s = "Welcome to javapoint";
            byte[] b = s.getBytes();
            four.write(b);
            four.close();
            System.out.println("success");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
