package com.onurdesk.string.programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringRemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		removeDuplicates(str);

	}

	private static void removeDuplicates(String str) {
		String[] words = str.split(" ");

		Set<String> setOfWords = new LinkedHashSet<>(Arrays.asList(words));
		StringBuffer sb = new StringBuffer();
		int index = 0;
		System.out.println("After Removing Elements are :");
		for (String word : setOfWords) {
			if (index > 1) {
				sb.append(" ");
				sb.append(word);
			}
			index++;
		}
		str = sb.toString();
		System.out.println("After Removing Elements are :" + str);
	}

}
