package com.osiki.javatpoint;

public class Honda extends Bicycle{
  void run(){
      System.out.println("Riding bicycle");
  }

    public static void main(String[] args) {
        Bicycle b1 = new Honda();
        b1.run();
    }

}
