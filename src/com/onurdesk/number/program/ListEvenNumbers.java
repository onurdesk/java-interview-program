package com.onurdesk.number.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListEvenNumbers {

	/**
	 * 
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		// define the limit
		int limit;

		System.out.println("Enter the Limit:");

		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);

		limit = Integer.parseInt(in.readLine());

		System.out.println("Printing Even numbers from 1 and " + limit);

		for (int i = 1; i <= limit; i++) {

			// if the number is divisible by 2 then it is even
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
