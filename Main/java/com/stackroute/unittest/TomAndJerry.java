package com.stackroute.unittest;

import java.util.Scanner;

@SuppressWarnings("unused")
public class TomAndJerry {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		TomAndJerryFunction tj=new  TomAndJerryFunction();
		String res=tj.tomAndJerry(n);
		System.out.println(res);
	}
}
