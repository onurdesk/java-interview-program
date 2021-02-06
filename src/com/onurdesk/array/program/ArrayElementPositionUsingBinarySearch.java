package com.onurdesk.array.program;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementPositionUsingBinarySearch {
	public static int binarySearch(int ary[], int key) {
		int start = 0;
		int end = ary.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == ary[mid]) {
				return mid;

			}
			if (key < ary[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int len = sc.nextInt();
		int arry[] = new int[len];
		System.out.println("Enter array elements ");
		for (int i = 0; i < len; i++) {
			arry[i] = sc.nextInt();
		}
		Arrays.sort(arry);
		System.out.println("After sorting elements are :");
		for (int a : arry) {
			System.out.println(a);
		}
		System.out.println("Enter key value");
		int k = sc.nextInt();
		System.out.println("element position is on index number is " + binarySearch(arry, k));

	}

}
