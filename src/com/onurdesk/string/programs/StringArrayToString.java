package com.onurdesk.string.programs;

public class StringArrayToString {

	public static void main(String[] args) {
		String[] arr = { "om prakash", "subani", "naveen" };
		String s1 = String.join(" ", arr);
		String s2 = String.join(",", arr);
		System.out.println(arr);
		System.out.println(s1);
		System.out.println(s2);
	}

}
