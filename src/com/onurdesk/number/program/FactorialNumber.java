package com.onurdesk.number.program;

public class FactorialNumber {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial number is " + factNumber(n));

	}

	public static int factNumber(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
