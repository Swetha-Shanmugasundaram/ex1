package com.stackroute.unittest;

public class ReverseAStringFunction {
    public String reverse(String s){
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp+=s.charAt(s.length()-i-1);
        }
        return temp;
    }
}
