package com.stackroute.unittest;

public class TomAndJerryFunction {
    public String tomAndJerry(int n){
        String temp="";
        if(n>20 && n<30)
        {
            if(n%2==0)
            {
                temp="Tom";
            }
            else
            {
                temp="Jerry";
            }
        }
        else
        {
            temp="Enter valid input";
        }
        return temp;
    }
}
