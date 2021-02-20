package com.onurdesk.number.program;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		String numberString = String.valueOf(n);
		String reverse = "";
		for (int i = numberString.length() - 1; i >= 0; i--) {
			reverse = reverse + numberString.charAt(i);
		}
		System.out.println(Integer.valueOf(reverse));

	}

}
