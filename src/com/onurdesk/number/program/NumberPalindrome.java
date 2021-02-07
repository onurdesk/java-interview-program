package com.onurdesk.number.program;
//--------------------------------------------------
//19.Check whether the number is palindrome or not
//--------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPalindrome {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		int number,temp,reversedNumber=0,beforeReverse;  

		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);

		System.out.println("Enter the number");

		number = Integer.parseInt(in.readLine());
		beforeReverse = number;
		
		//reverse the number
		while(number > 0){
			temp = number % 10;
			number = number / 10;
			reversedNumber = reversedNumber * 10 + temp;
		}

		if(beforeReverse == reversedNumber)
			System.out.println(beforeReverse + " is a palindrome number");
		else
			System.out.println(beforeReverse + " is not a palindrome number");
	}

}


//19.Program Output:
//----------------
//Enter the number 
//343 
//343 is a palindrome number 