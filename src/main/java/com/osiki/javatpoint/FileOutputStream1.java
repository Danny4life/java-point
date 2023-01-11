package com.osiki.javatpoint;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
    public static void main(String[] args) {
        try {
            FileOutputStream four = new FileOutputStream("D:\\testout.txt");
            four.write(64);
            four.close();
            System.out.println("success");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
