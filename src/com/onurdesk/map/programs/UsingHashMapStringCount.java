package com.onurdesk.map.programs;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMapStringCount {

	public static void main(String[] args) {
		String s = "naveen";
		HashMap<Character, Integer> map = new HashMap<>();
		char c[] = s.toCharArray();
		int size = c.length;
		int i = 0;
		while (i != size) {
			if (map.containsKey(i) == false) {
				map.put(c[i], 1);
			} else {
				int old = map.get(i);
				int newvalue = old + 1;
				map.put(c[i], newvalue);
			}
			i++;
		}
		System.out.println(map);
	}

}
