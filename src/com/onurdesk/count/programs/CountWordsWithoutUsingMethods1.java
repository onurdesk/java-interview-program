package com.onurdesk.count.programs;

import java.util.Scanner;

public class CountWordsWithoutUsingMethods1 {
	public static int countWords(String str) {
		String SPACE = " ";
		int countWords = 0;
		String words[] = str.split(SPACE);

		for (String word : words) {
			if (word.trim().length() > 0)
				;
			{
				countWords++;
			}
		}

		return countWords;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentance");
		String str = sc.nextLine();
		System.out.println(countWords(str));

	}

}
