package com.onurdesk.check.programs;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  Number ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("It is a even Number");
		} else {
			System.out.println("It is a Odd Number");
		}
	}

}
