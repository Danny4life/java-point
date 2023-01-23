package com.osiki.javatpoint;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {

            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            System.out.println("protocol " + url.getProtocol());
            System.out.println("Host name " + url.getHost());
            System.out.println("Port " + url.getPort());
            System.out.println("File name " + url.getFile());
        }catch (Exception e){
            System.out.println(e);

        }
    }
}
