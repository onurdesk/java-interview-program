package com.onurdesk.array.program;

import java.util.Arrays;

public class Prrint2DArray {

	public static void main(String[] args) {
		int[][] a = { { 2, 3 }, { 5, 4 }, { 2, 4, 7 } };
		// with out method
		System.out.println(Print2DArray(a));
	}

	public static String Print2DArray(int a[][]) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < a.length; i++) {
			sb.append(Arrays.toString(a[i]) + " ,");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		sb.append("}");
		return sb.toString();

	}

}
