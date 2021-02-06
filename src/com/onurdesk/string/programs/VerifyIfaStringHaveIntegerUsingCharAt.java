package com.onurdesk.string.programs;

import java.util.Scanner;

public class VerifyIfaStringHaveIntegerUsingCharAt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String");
		String x = s.nextLine();
		int size = x.length();
		int i = 0;
		while (i != size) {
			if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				++i;
			} else {
				System.out.println("It is not Integer String");
				System.exit(0);
			}
		}
		System.out.println("It is Integer String");

	}

}
