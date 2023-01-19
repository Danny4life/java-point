package com.osiki.javatpoint;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer1 {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(3333);
        Socket ss = s.accept();
        DataInputStream din = new DataInputStream(ss.getInputStream());
        DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        String str2 = "";

        while(!str.equals("stop")){
            str = din.readUTF();
            System.out.println("client say: " + str);

            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        ss.close();
        s.close();

    }
}
