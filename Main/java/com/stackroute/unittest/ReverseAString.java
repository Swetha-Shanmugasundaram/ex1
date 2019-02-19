package com.stackroute.unittest;

import java.util.Scanner;

public class ReverseAString {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = scan.next();
		ReverseAStringFunction r=new ReverseAStringFunction();
		String res=r.reverse(s);
		System.out.println(res);

	}
}
