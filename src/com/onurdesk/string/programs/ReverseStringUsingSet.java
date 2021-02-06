package com.onurdesk.string.programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseStringUsingSet {

	public static void main(String[] args) {
		String s = "Omprakasaaah";
		char[] ch = s.toCharArray();
		List<char[]> list = Arrays.asList(ch);
		Set<char[]> set = new LinkedHashSet<>(list);
		for (char[] o : set) {
			System.out.print(o);
		}

	}

}
