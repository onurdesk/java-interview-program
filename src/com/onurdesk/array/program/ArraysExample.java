package com.onurdesk.array.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("guvava");
		System.out.println(list);
		String[] s = { "first", "second", "third", "fourth" };
		System.out.println(s);
		System.out.println(Arrays.toString(s));
		String[] s1 = { "fifth", "sixth", "seventh" };
		String[][] s2 = { s, s1 };
		System.out.println(Arrays.deepToString(s2));

	}

}
