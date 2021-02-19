package com.onurdesk.array.program;

package ArrayRelatedPrograms;

/**
 * @author Onurdesk
 *
 *         Thanks for visiting https://onurdesk.com like us on facebook :
 *         https://facebook.com/onurdesk
 */
public class SmallestElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 24, 3, 5, 46, 56, 78, 12, 3, 44 };
		smallestElementInArray(a);
	}

	public static void smallestElementInArray(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Samallest element in array is " + min);
	}
}
