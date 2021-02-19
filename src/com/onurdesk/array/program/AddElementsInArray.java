package com.onurdesk.array.program;

import java.util.Scanner;

public class AddElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an arrray size");
		int size = sc.nextInt();
		System.out.println("Enter the elements of an array");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i : array) {
			sum = sum + i;
		}
		System.out.println("sum of array elements are " + sum);
	}

}
