package com.onurdesk.number.program;

public class PrimeNumberGenrator {

	public static void main(String[] args) {
		int start = 5;
		int end = 50;
		primeNumberGenerator(start, end);
	}

	public static void primeNumberGenerator(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}
