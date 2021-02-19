package com.onurdesk.array.program;

import java.util.Arrays;

public class CopyOfArrays {

	public static void main(String[] args) {
		String[] s = { "alex", "smith", "robin", "ward" };
		String[] s1 = s.clone();
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(s1));

	}

}
