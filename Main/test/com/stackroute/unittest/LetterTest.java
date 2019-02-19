package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class LetterTest {

    @Test
    public void letter1() {

        Letter cl = new Letter();

        String fun1 = cl.letter('a');
        String output1="Small Letter";
        assertEquals(output1,fun1);

    }

    @Test
    public void letter2() {
        Letter cl = new Letter();
        String fun2 = cl.letter('a');
        String output2="Capital Letter";
        assertNotEquals(fun2,output2);
    }

}