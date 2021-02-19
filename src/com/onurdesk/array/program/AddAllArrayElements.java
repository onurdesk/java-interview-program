package com.onurdesk.array.program;

public class AddAllArrayElements {

	public static void main(String[] args) {
		int[] arr = { 74, 784, 909 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

}