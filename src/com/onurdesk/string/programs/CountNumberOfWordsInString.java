package com.onurdesk.string.programs;

import java.util.StringTokenizer;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		String x = "om pakash big bosket etc mfdlkm";
		StringTokenizer st = new StringTokenizer(x);
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken());
		}

		String y[] = x.split("");
		System.out.println(y);

	}

}
