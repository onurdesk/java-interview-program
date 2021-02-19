package com.onurdesk.number.program;

//--------------------------------------------------
//18.List the Prime Numbers from 1 to N
//--------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListPrimeNumbers {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		int limit;

		System.out.println("Enter the Limit:");

		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);

		limit = Integer.parseInt(in.readLine());

		System.out.println("Prime numbers From 1 to " + limit);

		// loop from 1 to limit
		for (int i = 1; i < limit; i++) {

			boolean isPrime = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// print the number
			if (isPrime)
				System.out.print(i + " ");
		}
	}

}

//18.Program Output:
//----------------
//Enter the Limit: 
//100 
//Prime numbers From 1 to 100 
//1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97  