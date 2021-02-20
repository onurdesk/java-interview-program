package com.onurdesk.number.program;

//--------------------------------------------------
//25.Generate Fibonacci Series
//--------------------------------------------------

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to generate Fibonacci Series: ");
		int num = input.nextInt();
		System.out.println("Fibonacci Series: ");
		for (int i = 0; i < num; i++) {
			System.out.println(obj.fibonacci(i));
		}
	}

	private int fibonacci(int number) {

		if ((number == 0) || (number == 1))
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

}

//25.Program Output:
//----------------
//Enter number to generate Fibonacci Series:  
//10 
//Fibonacci Series:  
//0 
//1 
//1 
//2 
//3 
//5 
//8 
//13 
//21 
//34 
