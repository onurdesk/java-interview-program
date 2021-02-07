package com.onurdesk.exception.programs;

public class ExceptionExample5 {

	public static void main(String[] args) {
		try {
			System.out.println("No exception there");
			System.out.println("Again no exception There");
			System.out.println("Again and again No exception there");
		} catch (Exception e) {

			System.out.println("Exeption Occurs");

		} finally {
			System.out.println("I am From Finally Block");
			System.out.println("Thanks for reading onurdesk");
		}
		System.out.println(10 / 0);
	}
}
