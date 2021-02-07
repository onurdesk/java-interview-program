package com.onurdesk.number.program;
//--------------------------------------------------
//16.Swap values stored in variable using temp variable
//--------------------------------------------------

public class SwapTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;

		System.out.println("Before Swapping");
		System.out.println("Value stored in variable num1 :" + num1);
		System.out.println("Value stored in variable num2 :" + num2);

		//swap the values
		swap(num1, num2);

	}

	private static void swap(int num1, int num2) {

		int temp = num1;
		num1 = num2;
		num2 = temp;

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