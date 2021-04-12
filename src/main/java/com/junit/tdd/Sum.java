package com.junit.tdd;

import com.junit.tdd.interfaces.Expression;

public class Sum implements Expression {

    Money augend;
    Money addend;

    Sum (Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
