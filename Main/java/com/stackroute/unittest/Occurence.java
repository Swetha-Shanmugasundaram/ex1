package com.stackroute.unittest;

import java.util.Scanner;

public class Occurence {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = scan.nextLine();
		
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		System.out.print(s);
		for(int i=0;i<n;i++)
		{
			System.out.print(s.substring(s.length()-n, s.length()));
		}
		
	}
}
