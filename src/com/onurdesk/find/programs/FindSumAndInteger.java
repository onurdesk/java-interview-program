package com.onurdesk.find.programs;

import java.util.Scanner;

public class FindSumAndInteger {

	public static void main(String[] args) {
		int a, b, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Sum is " + sum);
		avg = (float) sum / 2;
		System.out.println("Average is " + avg);

	}

}
