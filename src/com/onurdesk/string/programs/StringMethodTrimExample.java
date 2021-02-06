package com.onurdesk.string.programs;

import java.util.Scanner;

public class StringMethodTrimExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter City Name :");
		String name = sc.nextLine().toLowerCase().trim();
		if (name.equals("hyderabad")) {
			System.out.println("Welcome to Hyderabd.....");
		} else if (name.equals("chennai")) {
			System.out.println("Welcome to Chennai.....");
		} else if (name.equals("banglore")) {
			System.out.println("Welcome to Banglore.....");
		} else {
			System.out.println("Please enter valid city name ");
		}

	}

}
