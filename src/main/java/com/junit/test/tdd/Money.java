package com.junit.test.tdd;

public class Money {

    protected int amount;

    public Money () {

    }

    public Money(int amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier);
    }

}
