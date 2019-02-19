/*Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
*/
package com.stackroute.unittest;


import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n;
        int sum = 0;
        Total t=new Total();

        while ((n= input.nextInt()) != 0)
        {
            sum=t.total(n,sum);
        }
        System.out.println(sum);
    }
}
