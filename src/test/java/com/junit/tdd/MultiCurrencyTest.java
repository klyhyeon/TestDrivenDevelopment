package com.junit.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MultiCurrencyTest {

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
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }



}
