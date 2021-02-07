package com.onurdesk.exception.programs;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			System.out.println("No exception there");
			System.out.println("Again no exception There");
			System.out.println("Again and again No exception there");
		} catch (NullPointerException e) {

			System.out.println(10 / 0);

		} finally {
			System.out.println(10 / 0);

			System.out.println("Thanks for reading onurdesk");
		}
		System.out.println("Main Method ");

	}
}
