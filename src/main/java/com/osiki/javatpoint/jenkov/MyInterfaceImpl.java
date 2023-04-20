package com.osiki.javatpoint.jenkov;

public class MyInterfaceImpl implements MyInterface, MyOtherInterface{
    @Override
    public void sayHello() {
        System.out.println(MyInterface.hello);
    }

    @Override
    public void sayGoodBye() {
        String word = "goodbye my love";
        System.out.println(word);
    }

    public static void main(String[] args) {
        MyInterfaceImpl oBJ1 = new MyInterfaceImpl();
      MyInterface in = new MyInterfaceImpl();
      MyOtherInterface ou = new MyInterfaceImpl();
      MySubInterface subInterface = (MySubInterface)   oBJ1;

      in.sayHello();
      ou.sayGoodBye();
      subInterface.sub();



    }


    @Override
    public void sub() {

    }
}
