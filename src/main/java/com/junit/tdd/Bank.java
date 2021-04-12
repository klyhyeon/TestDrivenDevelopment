package com.junit.tdd;

import com.junit.tdd.interfaces.Expression;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
