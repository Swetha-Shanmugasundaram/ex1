package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class IterationFunctionTest {

    @Test
    public void iterate1() {
        String expected="122";
        IterationFunction i = new IterationFunction();
        String actual=i.iterate(2);
        assertEquals(expected,actual);
    }

    @Test
    public void iterate2() {
        String expected="122333";
        IterationFunction i = new IterationFunction();
        String actual=i.iterate(2);
        assertNotEquals(expected,actual);
    }

}