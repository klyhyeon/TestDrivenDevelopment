package com.junit.test.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO: Junit 버전때문에 발생하는 test build not found 오류같음
class CalculatorTest {

    @Test
    public void add() {
        Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        assertEquals(3, result);
    }

}