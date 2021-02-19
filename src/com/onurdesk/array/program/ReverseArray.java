package com.onurdesk.array.program;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int len = sc.nextInt();
		int arry[] = new int[len];
		System.out.println("Enter array elements ");
		for (int i = 0; i < len; i++) {
			arry[i] = sc.nextInt();
		}

		reverseArray1(arry, len);
	}

	private static void reverseArray1(int[] arry, int len) {

		for (int i = 0; i <= len / 2; i++) {
			int temp = arry[i];
			arry[i] = arry[len - 1];
			arry[len - 1] = temp;
			len--;
			System.out.println(arry[i]);

		}
	}

	// private static void reveseArray(int[] arry, int len) {
	// for(int i=len-1;i>=0;i--)
	{
		// System.out.println(arry[i]);
	}

}
