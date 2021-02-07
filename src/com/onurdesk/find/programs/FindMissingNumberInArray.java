package com.onurdesk.find.programs;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int n;
		int[] arr = { 1, 2, 3, 4, 5, 7 };
		n = 7;
		int excpted_output = n * ((n + 1) / 2);
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		int result = excpted_output - sum;
		System.out.println("Missing Number is " + result);

	}

}
