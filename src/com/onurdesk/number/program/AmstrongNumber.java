package com.onurdesk.number.program;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n = 193;
		amstrongNumber(n);

	}

	public static void amstrongNumber(int n) {
		int rem, sum = 0;
		int temp = n;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + (rem * rem * rem);
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("It is not Amstrong Number");
		}
	}

}
