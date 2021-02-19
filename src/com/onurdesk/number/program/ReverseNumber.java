package com.onurdesk.number.program;
//--------------------------------------------------

//21.Reverse the number
//--------------------------------------------------

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 1234;

		// Number before reverse
		int numberBeforeReverse = number;

		int reversedNumber = 0;
		int temp = 0;

		while (number > 0) {

			// use modulus operator to strip off the last digit
			temp = number % 10;

			// create the reversed number
			reversedNumber = reversedNumber * 10 + temp;
			number = number / 10;

		}

		// output the reversed number
		System.out.println("Number Before Reverse: " + numberBeforeReverse);
		System.out.println("Number After Reverse: " + reversedNumber);
	}

}

//
//21.Program Output:
//----------------
//Number Before Reverse: 1234 
//Number After Reverse: 4321 