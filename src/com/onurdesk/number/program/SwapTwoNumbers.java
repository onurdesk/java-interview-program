package com.onurdesk.number.program;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number ");
		int b = sc.nextInt();
		System.out.print("Before Swapping is ");
		System.out.println(a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.print("After Swapping is ");
		System.out.println(a + " " + b);

	}

}
