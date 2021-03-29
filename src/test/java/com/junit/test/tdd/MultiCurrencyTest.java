package com.junit.test.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MultiCurrencyTest {

    @Test
    public void testMultiplication() {
        Money five = new Dollar();
        five.amount = 5;
        assertEquals(5, five.amount);
    }

    @Test
    public void testExtensionMultiplication() {
        Money five = new Dollar();
        five.amount = 5;
        Money six = new Dollar();
        six.amount = 6;
        assertFalse(five.equals(six));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = new Franc();
        five.amount = 5;
        assertTrue(five.equals(five.times(1)));
    }

    @Test
    public void testEquality() {
        assertEquals(new Money(5), new Money(5));
    }



}
