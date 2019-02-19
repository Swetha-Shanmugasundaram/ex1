package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryFunctionTest {

    @Test
    public void tomAndJerry1() {
        String expected="Tom";
        TomAndJerryFunction tj=new TomAndJerryFunction();
        String actual=tj.tomAndJerry(22);
        assertEquals(expected,actual);
    }

    @Test
    public void tomAndJerry2() {
        String expected="Tom";
        TomAndJerryFunction tj=new TomAndJerryFunction();
        String actual=tj.tomAndJerry(23);
        assertNotEquals(expected,actual);
    }
}