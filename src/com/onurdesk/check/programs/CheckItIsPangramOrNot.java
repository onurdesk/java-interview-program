package com.onurdesk.check.programs;
import java.util.Scanner;

public class CheckItIsPangramOrNot 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any pangram");
		String x=s.nextLine();
		x=x.replaceAll(" ", "");
		char [] y=x.toCharArray();
		int size=y.length;
		char [] a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		while(i!=size)
		{
			int index=y[i]-65;
			a[index]=1;
		}
	   i=0;
	   while(i!=26)
	   {
		   if(a[i]==1)
		   {
			   i++;
		   }else
		   {
			System.out.println("It is not pangram"); 
			System.exit(0);
		   }
		   
	   }
	   System.out.println("It is a pangram");

	}

}
