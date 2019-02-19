package com.stackroute.unittest;

import java.util.Scanner;
 
class Palindrome {
  
@SuppressWarnings("resource")
public static void main(String args[])
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter a number");
      int x=scan.nextInt();
      PalindromeFunction p=new PalindromeFunction();
      String res=p.palindrome(x);
      System.out.println(res);
   }
}