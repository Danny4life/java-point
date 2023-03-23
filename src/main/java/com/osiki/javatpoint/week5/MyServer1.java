package com.osiki.javatpoint.week5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer1 {
    public static void main(String[] args) throws Exception {

        // establish a port to connect with
        ServerSocket ss = new ServerSocket(3333);
        // estalblish a socket connection
        Socket s = ss.accept();
        // to read input from client
        DataInputStream dit = new DataInputStream(s.getInputStream());
        // to write output to a client
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = "";
        String str2 = "";

        while(!str.equals("stop")){
            str = dit.readUTF();
            System.out.println("client says: " + str);

            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }

        dit.close();
        ss.close();
        s.close();

    }
}
