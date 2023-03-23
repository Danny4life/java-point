package com.osiki.javatpoint.week5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient1 {

    public static void main(String[] args) throws Exception {
        Socket ss = new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(ss.getInputStream());
        DataOutputStream dou = new DataOutputStream(ss.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        String str2 = "";

        while(!str.equals("stop")){
            str = br.readLine();
            dou.writeUTF(str);
            dou.flush();
            str2 = din.readUTF();
            System.out.println("server says: " + str2);
        }

        dou.close();
        ss.close();

    }
}
