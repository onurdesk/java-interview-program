package com.onurdesk.loop.program;

public class BreakStatement {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println("i=" + i);
			if (i == 4) {
				System.out.println("Break statement executes and loop breaks when i value is equal to 4");
				break;
			}
		}
	}

}