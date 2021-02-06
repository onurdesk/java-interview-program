package com.onurdesk.array.program;

public class ArraysParctice {

	public static void main(String[] args) {
		System.out.println(sum(new int[] { 1, 3, 4, 6 }));
	}

	public static int sum(int[] x) {
		int tot = 0;
		for (int x1 : x) {
			tot += x1;
		}
		return tot;
	}

}
