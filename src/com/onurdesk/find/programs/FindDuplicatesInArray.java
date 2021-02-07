package com.onurdesk.find.programs;

import java.util.Scanner;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[50];
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		duplicates(arr, size);
	}

	private static void duplicates(int[] arr, int size) {
		System.out.println("After removes duplicates elements are :");
		int count, i;
		for (i = 0; i < size; i++) {
			count = 0;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j])
					count++;
			}
		}
		if (count == 1) {
			System.out.print(arr[i] + " ");
		}
	}

}
