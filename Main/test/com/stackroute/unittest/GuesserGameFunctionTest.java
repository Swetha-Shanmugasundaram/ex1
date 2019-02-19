package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuesserGameFunctionTest {

    @Test
    public void guess1() {
        String expected="Number guessed is less than target number";
        GuesserGameFunction g=new GuesserGameFunction();
        String actual=g.guess(45,85);
        assertEquals(expected,actual);
    }

    @Test
    public void guess2() {
        String expected="Number guessed is greater than target number";
        GuesserGameFunction g=new GuesserGameFunction();
        String actual=g.guess(45,85);
        assertNotEquals(expected,actual);
    }

}