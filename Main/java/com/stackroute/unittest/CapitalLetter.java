package com.stackroute.unittest;

import java.util.Scanner;
import java.lang.String;

public class CapitalLetter {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Letter le = new Letter();

		System.out.println("Enter a character");
		char c = scan.next().charAt(0);

		String str = le.letter(c);

		System.out.println(str);


			
	}

}
