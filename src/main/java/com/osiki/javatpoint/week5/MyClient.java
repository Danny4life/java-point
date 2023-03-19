package com.osiki.javatpoint.week5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try{
            Socket ss = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
            dout.writeUTF("Hello server here");
            dout.flush();
            dout.close();
            ss.close();

        }catch (IOException e){
            System.out.println(e);

        }
    }
}
