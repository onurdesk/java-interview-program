package com.onurdesk.check.programs;
// Array is sorted or not 

class CkeckSorted {
	// Function that returns 0 if a pair
	// is found unsorted
	static int arraySortedOrNot(int arr[], int n) {
		// Array has one or no element or the
		// rest are already checked and approved.
		if (n == 1 || n == 0)
			return 1;

		// Unsorted pair found (Equal values allowed)
		if (arr[n - 1] < arr[n - 2])
			return 0;

		// Last pair was sorted
		// Keep on checking
		return arraySortedOrNot(arr, n - 1);
	}

	// main function
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 3, 2 };
		int n = arr.length;
		if (arraySortedOrNot(arr, n) != 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}