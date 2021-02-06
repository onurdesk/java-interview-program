package com.onurdesk.string.programs;

import java.util.Scanner;

public class ComputingLengthOfString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String");
		String x = s.nextLine();
		x = x.concat("\0");
		char[] y = x.toCharArray();
		int count = 0;
		int i = 0;
		while (y[i] != '\0') {
			count++;
			i++;
		}
		System.out.println(count);

	}

}
