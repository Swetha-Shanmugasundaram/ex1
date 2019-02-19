package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeFunctionTest {

    @Test
    public void palindrome1() {
        String expected="Success";
        PalindromeFunction p=new PalindromeFunction();
        String actual=p.palindrome(88866888);
        assertEquals(expected,actual);
    }

    @Test
    public void palindrome2() {
        String expected="Success";
        PalindromeFunction p=new PalindromeFunction();
        String actual=p.palindrome(121);
        assertNotEquals(expected,actual);
    }
}