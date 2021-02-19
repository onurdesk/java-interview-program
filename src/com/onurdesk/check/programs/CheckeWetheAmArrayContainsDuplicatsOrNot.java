package com.onurdesk.check.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckeWetheAmArrayContainsDuplicatsOrNot {

	public static void main(String[] args) {
		String arry[] = { "java", "sql", "java", "C langugae" };
		List<String> duplicateList = Arrays.asList(arry);
		Set<String> duplicateSet = new HashSet<>(duplicateList);
		if (duplicateList.size() != duplicateSet.size()) {
			System.out.println("It contains duplicates");
		} else {
			System.out.println("It does not contain duplicates");
		}

	}

}
