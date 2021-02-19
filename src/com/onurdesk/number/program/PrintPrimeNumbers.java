package com.onurdesk.number.program;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count;
		System.out.println("Enter Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter Ending Number");
		int end=sc.nextInt();
		System.out.println("Prime Number given range is "+start+" and "+end);
		for(int i=start;i<end;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)	
			{
				System.out.print(i+" ");
			}
		}
	}

}
