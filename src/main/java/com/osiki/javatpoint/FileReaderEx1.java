package com.osiki.javatpoint;

import java.io.FileReader;

public class FileReaderEx1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("testout.txt");

        int i;

        while((i = fr.read())!= -1);
        System.out.println((char)i);
        fr.close();

    }
}
