package com.onurdesk.number.program;

import java.util.Scanner;

public class SumOfFactorsGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any NUmber");
		int num = sc.nextInt();
		System.out.println(SumOfNUmber(num));
	}

	private static int SumOfNUmber(int num) {
		int f_sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				f_sum = f_sum + num;
			}
		}
		return f_sum;
	}

}
