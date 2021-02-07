package com.onurdesk.find.programs;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = s.nextInt();
		int fact = 1;
		int i;
		for (i = 1; i <= x; i++) {
			fact = fact * i;
		}
		System.out.println("factorial numner is " + fact);

	}
}
