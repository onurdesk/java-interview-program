package com.onurdesk.loop.program;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter one digit from 0 to 6: ");
		int num = input.nextInt();

		switch (num) {
		case 0:
			System.out.println("Your Lucky Day is Sunday");
			break;
		case 1:
			System.out.println("Your Lucky Day is Monday");
			break;
		case 2:
			System.out.println("Your Lucky Day is Tuesday");
			break;
		case 3:
			System.out.println("Your Lucky Day is Wednesday");
			break;
		case 4:
			System.out.println("Your Lucky Day is Thursday");
			break;
		case 5:
			System.out.println("Your Lucky Day is Friday");
			break;
		case 6:
			System.out.println("Your Lucky Day is Saturday");
			break;
		default:
			System.out.println("Please select the right option");
			break;
		}
	}

}