package com.osiki.javatpoint;

import java.io.FileReader;

public class FileReader2 {
    public static void main(String[] args) throws Exception {

        FileReader fw = new FileReader("text.txt");

        int i;

        while((i = fw.read()) != -1){
            System.out.println((char) i);
            fw.close();
        }
    }
}
