package com.stackroute.unittest;

public class Letter {

    public String letter(char c)
    {
        String t="";
        if(c>=65 && c<=90)
        {
            t="Capital Letter";
        }
        else if(c>=97 && c<=122)
        {
            t="Small Letter";
        }
        else if(c>=48 && c<=57)
        {
            t="Digits";
        }
        else
        {
            t="Special Characters";
        }
        return t;
    }
}
