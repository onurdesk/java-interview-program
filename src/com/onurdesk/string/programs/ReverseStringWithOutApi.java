package com.onurdesk.string.programs;

public class ReverseStringWithOutApi {

	public static void main(String[] args) {
		String s = "Learn Java Coding";
		char[] ch = s.toCharArray();
		int size = ch.length;
		char[] rev = new char[size];
		for (int i = 0; i < size; i++) {
			rev[i] = ch[size - 1 - i];
		}
		System.out.println(rev);
	}

}
