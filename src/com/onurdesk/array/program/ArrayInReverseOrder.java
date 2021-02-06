package com.onurdesk.array.program;

public class ArrayInReverseOrder {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		reverseOrder(a);
	}

	public static void reverseOrder(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}