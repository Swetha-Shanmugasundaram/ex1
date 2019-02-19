package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortFunctionTest {

    @Test
    public void sort1() {
        SortFunction d1=new SortFunction();
        String expected="success";
        String output=d1.sort(2266888);
        assertEquals(expected,output);

    }

    @Test
    public void sort2() {
        SortFunction d1=new SortFunction();
        String expected="success";

        String output=d1.sort(234);
        assertNotEquals(expected,output);

    }
}