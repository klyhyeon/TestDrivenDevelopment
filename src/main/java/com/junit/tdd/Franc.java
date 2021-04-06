package com.junit.tdd;

class Franc extends Money {

    private String currency;

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    String currency() {
        return currency;
    }
}
