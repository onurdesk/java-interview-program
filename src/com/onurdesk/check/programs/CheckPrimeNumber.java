package com.onurdesk.check.programs;

public class CheckPrimeNumber
{

	public static void main(String[] args) {
		int n = 44;
		primeNumber(n);
	}
     public static void primeNumber(int n)
     {
    	 if(n%2==1)
    	 {
    		 System.out.println("It is a Prime Number ");
    	 }else
    	 {
    		 System.out.println("It is a not prime number");
    	 }
     }
}
  