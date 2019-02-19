package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAStringFunctionTest {

    @Test
    public void reverse1() {
        String expected="iniwhsa";
        ReverseAStringFunction r=new ReverseAStringFunction();
        String actual=r.reverse("ashwini");
        assertEquals(expected,actual);
    }

    @Test
    public void reverse2() {
        String expected="iniwhsa";
        ReverseAStringFunction r=new ReverseAStringFunction();
        String actual=r.reverse("ankita");
        assertNotEquals(expected,actual);
    }
}