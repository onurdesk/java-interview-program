package com.onurdesk.string.programs;

import java.util.Arrays;

public class StingIntoStringArray {

	public static void main(String[] args) {
		String s = "I am wirting coding";
		String[] words = s.split("6");
		System.out.println(s);
		System.out.println(words);
		System.out.print(Arrays.toString(words));
	}

}