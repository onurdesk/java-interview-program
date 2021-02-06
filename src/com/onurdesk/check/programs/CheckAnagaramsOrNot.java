package com.onurdesk.check.programs;


import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagaramsOrNot
{

	public static void main(String[] args)
	{
		
		String str1 = "dealer";
        String str2="leader";
        boolean b=areAnagrams(str1,str2);
        if(b==true)
        {
        	System.out.println("it is a Anagran");
        }else
        {
        	System.out.println("It is a not anagarms");
        }
	}

	private static boolean areAnagrams(String str1, String str2) {
		  if(str1.length()!=str2.length())
		  {
			  return false;
		  }
		  str1=str1.toUpperCase();
		  str2=str2.toUpperCase();
		  
		  char[] str11=str1.toCharArray();
		  Arrays.sort(str11);
		  char[] str22=str2.toCharArray();
		  Arrays.sort(str22);
		  return Arrays.equals(str11, str22);
		  }

}
