package com.onurdesk.check.programs;
import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=scan.nextInt();
		int i,count=0;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
		System.out.println("It is Prime Number");	
		}else
		{
			System.out.println("It is not Prime Number");		
		}
	}

}
