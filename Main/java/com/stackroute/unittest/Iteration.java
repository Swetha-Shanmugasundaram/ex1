package com.stackroute.unittest;

import java.util.Scanner;

public class Iteration {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		IterationFunction p=new IterationFunction();

		String a = p.iterate(n);

		System.out.println(a);
	}

}
