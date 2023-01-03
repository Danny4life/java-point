package com.osiki.javatpoint;

import java.io.IOException;

public class TestChild extends Parent {

    @Override
    void msg() {
        super.msg();

        throw new ArithmeticException();
    }
}
