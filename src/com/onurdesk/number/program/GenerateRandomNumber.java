package com.onurdesk.number.program;
//--------------------------------------------------
//24.Generate Random Numbers
//--------------------------------------------------

import java.util.*;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter how many random number need to generate: ");
		Scanner inputNumber = new Scanner(System.in);
		int count=inputNumber.nextInt();
		Random randNum = new Random();

		System.out.println("Random Numbers: ");
		for (i = 1; i <= count; i++) {
			System.out.println(randNum.nextInt(100));
		}
	}

}
//24.Program Output:
//----------------
//Enter how many random number need to generate:  
//5 
//Random Numbers:  
//2 
//30 
//48 
//64 
//82
