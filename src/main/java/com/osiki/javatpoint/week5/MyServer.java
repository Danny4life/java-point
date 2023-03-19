package com.osiki.javatpoint.week5;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            // established connection
            Socket s = ss.accept();
            DataInputStream inp = new DataInputStream(s.getInputStream());
            String str = (String) inp.readUTF();
            System.out.println("message=" + str);
            ss.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
