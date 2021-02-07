package com.onurdesk.number.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListOddNumbers {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 //define the limit
        int limit;
        
        System.out.println("Enter the Limit:");
        
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);

		limit = Integer.parseInt(in.readLine());
       
        System.out.println("Printing Odd numbers from 1 and " + limit);
       
        for(int i=1; i <= limit; i++){
               
                //if the number is not divisible by 2 then it is odd
                if( i % 2 != 0){
                        System.out.print(i + " ");
                }
        }
	}

}