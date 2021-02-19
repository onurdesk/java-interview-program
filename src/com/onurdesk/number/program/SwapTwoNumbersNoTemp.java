package com.onurdesk.number.program;
//--------------------------------------------------

//17.Swap values without using temporary variable
//--------------------------------------------------

public class SwapTwoNumbersNoTemp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		System.out.println("Before Swapping");
		System.out.println("Value stored in variable num1 :" + num1);
		System.out.println("Value stored in variable num2 :" + num2);

		// add both the numbers and assign it to first
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("\nAfter Swapping");
		System.out.println("Value stored in variable num1 :" + num1);
		System.out.println("Value stored in variable num2 :" + num2);
	}

}

//Program Output:
//----------------
//Before Swapping 
//Value stored in variable num1 :10 
//Value stored in variable num2 :20  
// 
//After Swapping 
//Value stored in variable num1 :20 
//Value stored in variable num2 :10  
