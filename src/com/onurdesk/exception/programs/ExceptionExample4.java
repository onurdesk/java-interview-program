package com.onurdesk.exception.programs;

public class ExceptionExample4 {

	public static void main(String[] args) {
		try {
			System.out.println("No exception there");
			System.out.println("Again no exception There");
			System.out.println("Again and again No exception there");
		} catch (Exception e) {

			System.out.println("exception occurs");

		} finally {
			System.out.println(10 / 0);
		}
		System.out.println("Main Method ");
	}
}
