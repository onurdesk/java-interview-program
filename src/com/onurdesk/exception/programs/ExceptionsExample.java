package com.onurdesk.exception.programs;

public class ExceptionsExample {

	public static void main(String[] args) {
		try {
			System.out.println("No exception there");
			System.out.println("Again No exception there");
			System.out.println("Again and again No exception there");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Onurdesk");

			System.out.println("Thanks for reading onurdesk");
		}
		System.out.println("Main Method ");
	}
}
