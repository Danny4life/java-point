package com.osiki.javatpoint;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class Conditionals {

    public static void main(String[] args) throws NoSuchAlgorithmException {
//        int x = 20;
//        int y = 18;
//
//        if(x  > y){
//            System.out.println("20 is greater than 18");
//        }
//
//        int score = 40;
//        String GRADE = "";
//
//        if(score >= 70){
//            GRADE = "A";
//        } else if (score >= 60) {
//            GRADE = "B";
//
//        } else if (score >= 50) {
//            GRADE = "C";
//
//        }else {
//            System.out.println(GRADE = "F");
//        }


        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        keyPairGenerator.initialize(2048);

        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        System.out.println(keyPair);
    }
}
