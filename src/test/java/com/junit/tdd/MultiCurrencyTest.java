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
        Money dollar1 = Money.dollar(5);
        Money dollar2 = Money.dollar(5);
        Money franc1 = Money.franc(5);
        Money franc2 = Money.franc(5);
        assertTrue(franc1.equals(franc2));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testTimesReturnConstructor() {
        assertTrue(new Money(10, "CHF").times(4).equals(
                new Franc(10, "CHF").times(4)));
    }



}
