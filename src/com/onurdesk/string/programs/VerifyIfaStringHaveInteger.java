package com.onurdesk.string.programs;

import java.util.Scanner;

public class VerifyIfaStringHaveInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String");
		String x = s.nextLine();
		char[] y = x.toCharArray();
		int size = y.length;
		int i = 0;
		while (i != size) {
			if (y[i] >= '0' && y[i] <= '9') {
				++i;
			} else {
				System.out.println("It is not String Integer");
				System.exit(0);
			}
		}
		System.out.println("It is String Integer");
	}

}
