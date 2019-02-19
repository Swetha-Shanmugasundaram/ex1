package com.stackroute.unittest;

import java.util.Scanner;

public class Sort {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scan.nextInt();
		SortFunction d=new SortFunction();
		String res=d.sort(x);
		System.out.println(res);
	}
}
