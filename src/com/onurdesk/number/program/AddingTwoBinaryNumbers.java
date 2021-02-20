package com.onurdesk.number.program;

import java.util.Scanner;

public class AddingTwoBinaryNumbers {

	public static void main(String[] args) {
		long a, b;
		int carray = 0, i = 0;
		int sum[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Binary Number");
		a = sc.nextLong();
		System.out.println("Enter Second Binary Number");
		b = sc.nextLong();
		while (a != 0 || b != 0) {
			sum[i++] = (int) ((a % 10 + a % 10 + carray) % 2);
			carray = (int) ((b % 10 + b % 10 + carray) / 2);
			a = a / 10;
			b = b / 10;
		}
		if (carray != 0) {
			sum[i++] = carray;
		}
		--i;
		while (i > 0) {
			System.out.print(sum[i--]);
		}

		System.out.print("\n");
	}

}
