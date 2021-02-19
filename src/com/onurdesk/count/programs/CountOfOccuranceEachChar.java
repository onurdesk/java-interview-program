package com.onurdesk.count.programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfOccuranceEachChar {

	public static void main(String[] args) {

		String str = "Learn Java Coding";
		countOfOccuranc1e(str);
	}

	private static void countOfOccuranc1e(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> s = map.entrySet();
		Iterator<Entry<Character, Integer>> itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) itr.next();
			System.out.println(entry.getKey() + "------" + entry.getValue());
		}

	}

}
