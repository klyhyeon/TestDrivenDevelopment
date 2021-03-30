package com.junit.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MultiCurrencyTest {

    @Test
    public void testMultiplication() {
    }

    @Test
    public void testExtensionMultiplication() {
    }

    @Test
    public void testFrancMultiplication() {
        Money dollarMultiple = Money.dollar(5);
        assertEquals(dollarMultiple, dollarMultiple.times(2));
    }

    @Test
    public void testEquality() {
        Money dollar1 = new Dollar(5);
        Money dollar2 = new Dollar(5);
        Money franc1 = new Franc(5);
        Money franc2 = new Franc(5);
        assertTrue(franc1.equals(franc2));
    }



}
