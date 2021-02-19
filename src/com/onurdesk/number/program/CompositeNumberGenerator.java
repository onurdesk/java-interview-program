package com.onurdesk.number.program;

public class CompositeNumberGenerator {

	public static void main(String[] args) {
		int start = 20;
		int end = 30;
		compositeNumberGenerator(start, end);
	}

	public static void compositeNumberGenerator(int start, int end) {
		int c;
		for (int i = start; i <= end; i++) {
			c = 0;
			for (int j = 2; j <= end; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c > 1) {
				System.out.print(i + " ");
			}
		}

	}
}
