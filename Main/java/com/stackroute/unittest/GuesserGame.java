package com.stackroute.unittest;

import java.util.Scanner;

public class GuesserGame {
	@SuppressWarnings({"resource","unused"})
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GuesserGameFunction g = new GuesserGameFunction();
		
		int target=85;

			System.out.println("Guess a number");
			int n = scan.nextInt();

			String a = g.guess(n,target);

			System.out.println(a);

	}
}
