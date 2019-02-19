package com.stackroute.unittest;

public class GuesserGameFunction {
    public String guess(int n, int target)
    {
        String temp="";

        if(n>target)
        {
            temp="Number guessed is more than target number";
        }
        else if(n<target)
        {
            temp="Number guessed is less than target number";
        }
        else
        {
            temp="Number guessed matched the target number";

        }

        return temp;
    }
}
