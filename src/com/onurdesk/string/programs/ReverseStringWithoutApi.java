package com.onurdesk.string.programs;

import java.util.Scanner;

public class ReverseStringWithoutApi {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any String here ");
		String a = s.nextLine();
		char arr[] = a.toCharArray();
		int size = arr.length;
		char arr1[] = new char[size];
		int i = 0;
		while (i != size) {
			arr1[size - 1 - i] = arr[i];
			i++;
		}
		System.out.println(arr1);

	}

}
