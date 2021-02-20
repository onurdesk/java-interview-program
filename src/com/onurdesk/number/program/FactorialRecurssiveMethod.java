package com.onurdesk.number.program;
//--------------------------------------------------

//23.Factorial of number using recursive method
//--------------------------------------------------

public class FactorialRecurssiveMethod {

	public static void main(String[] args) {

		FactorialRecurssiveMethod obj = new FactorialRecurssiveMethod();

		int num = 6;

		int result = obj.fact(num);

		System.out.println("Factorial of a number " + num + " is " + result);
	}

	private int fact(int num) {
		if (num <= 1)
			// if the number is 1 then return 1
			return 1;
		else
			// else call the same function with the value - 1
			return num * fact(num - 1);
	}

}

//23.Program Output:
//----------------
//Factorial of a number 6 is 720