package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void 더하기_테스트() {
        int res = Calculator.run("1 + 1");
        assertEquals(2,res);
    }

    @Test
    public void 더하기_테스트2() {
        int res = Calculator.run("10 + 10");
        assertEquals(20,res);
    }

    @Test
    public void 빼기_테스트() {
        int res = Calculator.run("1 - 1");
        assertEquals(0, res);
    }

    @Test
    public void 빼기_테스트2() {
        int res = Calculator.run("10 - 1");
        assertEquals(9, res);
    }

}
