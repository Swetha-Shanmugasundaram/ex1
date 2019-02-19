package com.stackroute.unittest;

public class IterationFunction {
    public String iterate(int n){
        String temp="";
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                temp+=(i);
            }
        }
        return temp;
    }
}
