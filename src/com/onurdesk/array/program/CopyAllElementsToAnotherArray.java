package com.onurdesk.array.program;

public class CopyAllElementsToAnotherArray {

	public static void main(String[] args) {
		int[] array1 = { 3, 4, 5, 6, 7, 8, 9 };
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
			System.out.print(array2[i] + " ");
		}

	}

}
