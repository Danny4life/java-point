package com.osiki.javatpoint.jenkov;

public class MyCarProducer implements MyProducer{
    @Override
    public Object produce() {
        return new MyCarProducer();
    }


    public static void main(String[] args) {
        MyProducer car = new MyCarProducer();
    }
}
