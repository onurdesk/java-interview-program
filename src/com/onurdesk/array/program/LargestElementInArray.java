package com.onurdesk.array.program;

public class LargestElementInArray {

	public static void main(String[] args) {
		int a[] = { 24, 3, 5, 46, 56, 78, 12, 3, 44 };
		largestElement(a);
	}

	public static void largestElement(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("Maxmium element in array is " + max);
	}

}
