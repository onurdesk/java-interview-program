package com.onurdesk.string.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicatesCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String Here ");
		String str = sc.nextLine();
		FindDuplicats fd = new FindDuplicats();
		fd.dupChar(str);

	}
}
