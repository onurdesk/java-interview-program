package com.onurdesk.number.program;

import java.util.Scanner;

public class SwapTwoNumberWithOutTemp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value here ");
		int a = s.nextInt();
		System.out.println("Enter b value here ");
		int b = s.nextInt();
		System.out.println("Before Swapping are :" + a + ":" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping are :" + a + ":" + b);

	}

}
