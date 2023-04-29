package com.osiki.javatpoint.jenkov;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");


        System.out.println("peek the top ele = " + stack.peek());

        System.out.println("stack =" + stack);

        String popEle = stack.pop();

        System.out.println("pop element = " + popEle);

        System.out.println("new stack element = " + stack);

        for(String s : stack){
            System.out.println(s);
        }

    }
}
