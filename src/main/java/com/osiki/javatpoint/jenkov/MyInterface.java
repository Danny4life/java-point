package com.osiki.javatpoint.jenkov;





public interface MyInterface extends MyOtherInterface, MySubInterface {

    public String hello = "Hello";

    public static void print(String text){
        System.out.println(text);
    }



    public void sayHello();

    public static void main(String[] args) {
        System.out.println(MyInterface.hello);
        MyInterface.print("print me please");
        System.out.println(MyOtherInterface.day);
    }
}
