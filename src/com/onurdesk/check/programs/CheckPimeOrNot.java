package com.onurdesk.check.programs;
import java.util.Scanner;

public class CheckPimeOrNot
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number...");
		int num=sc.nextInt();
		int i,count=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("It is Prime Number ");
		}else
		{
			System.out.println("It is not Prime Number");
		}
	}

}
