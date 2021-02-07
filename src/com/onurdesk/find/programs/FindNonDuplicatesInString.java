package com.onurdesk.find.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class FindNonDuplicatesInString {
	public static void dupChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();
		for (char c1 : set) {
			if (map.get(c1) > 1) {
				System.out.println(c1 + " is " + map.get(c1) + " times");
			}
		}

	}

}
