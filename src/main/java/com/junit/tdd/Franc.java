package com.junit.tdd;

class Franc extends Money {

    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
