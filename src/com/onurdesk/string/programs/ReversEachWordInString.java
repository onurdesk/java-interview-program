package com.onurdesk.string.programs;

import java.util.Arrays;

public class ReversEachWordInString {

	public static void main(String[] args) {
		String s = "Lern Java Coding";
		String[] ch = s.split(" ");
		int size = ch.length;
		String[] c = new String[size];
		int i = 0;
		while (i != size) {
			c[i] = (String) (ch[size - 1 - i]);
		}
		System.out.println(c);

	}

}
