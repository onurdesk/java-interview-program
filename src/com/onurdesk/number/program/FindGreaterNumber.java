package com.onurdesk.number.program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindGreaterNumber {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		int number1,number2;  

		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);

		System.out.println("Enter the 1st number");

		number1 = Integer.parseInt(in.readLine());

		System.out.println("Enter the 2nd number");

		number2 = Integer.parseInt(in.readLine());


		if(number1 > number2)
			System.out.println(number1+" is greater than "+number2);
		else
			System.out.println(number2+" is greater than "+number1);
	}
}