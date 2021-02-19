package com.onurdesk.check.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CheckIfaStringHasAllUniqueCharacters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any word");
		String x = s.nextLine();
		char y[] = x.toCharArray();
		int size = y.length;
		Map<Character, Integer> map = new HashMap<>();
		int i = 0;
		while (i != 0) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldval = map.get(y[i]);
				int newval = oldval + 1;
				map.put(y[i], newval);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> heap = map.entrySet();
		for (Map.Entry<Character, Integer> data : heap) {
			if (data.getValue() > 1) {
				System.out.println("It does not contain unique Characters");
				System.exit(0);
			}
		}
		System.out.println("It contains all unique characters");
	}
}
