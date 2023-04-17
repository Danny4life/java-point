package com.osiki.javatpoint.jenkov;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLProcessImpl extends URLprocessorBase{
    @Override
    protected void processedURLData(InputStream input) throws IOException {
        int data = input.read();

        while (data != -1){
            System.out.println((char) data);
            data = input.read();
        }
    }

    public static void main(String[] args) throws IOException {
        URLProcessImpl url = new URLProcessImpl();
        url.process(new URL("http://jenkov.com"));
    }
}
