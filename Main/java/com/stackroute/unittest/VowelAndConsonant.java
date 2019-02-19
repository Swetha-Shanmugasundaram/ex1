package com.stackroute.unittest;

import java.util.Scanner;

@SuppressWarnings("unused")
public class VowelAndConsonant {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = scan.next();
		VowelandConsonantFunction vc=new VowelandConsonantFunction();
		String res=vc.vowelConsonant(s);
		System.out.println(res);
	}
}
