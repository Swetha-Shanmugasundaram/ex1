package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelandConsonantFunctionTest {

    @Test
    public void vowelConsonant1() {
        String expected="vowel consonant ";
        VowelandConsonantFunction vc=new VowelandConsonantFunction();
        String actual=vc.vowelConsonant("ap");
        assertEquals(expected,actual);
    }

    @Test
    public void vowelConsonant2() {
        String expected="vowel consonant ";
        VowelandConsonantFunction vc=new VowelandConsonantFunction();
        String actual=vc.vowelConsonant("aa");
        assertNotEquals(expected,actual);
    }
}