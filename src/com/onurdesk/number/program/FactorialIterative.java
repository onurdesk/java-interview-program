package com.onurdesk.number.program;

//--------------------------------------------------
//22.Factorial of number using iterative method
//--------------------------------------------------

public class FactorialIterative {

	public static void main(String[] args) {

		int number = 5;

		/*
		 * Factorial of any number is !n. For example, factorial of 5 is 5*4*3*2*1.
		 */

		int factorial = number;

		// Factorial of a number by iterative method
		for (int i = (number - 1); i > 1; i--) {
			factorial = factorial * i;
		}

		System.out.println("Factorial of a number " + number + " is " + factorial);
	}

}

//22.Program Output:
//----------------
//Factorial of a number 5 is 120