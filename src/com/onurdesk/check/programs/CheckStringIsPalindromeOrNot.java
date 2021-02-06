package com.onurdesk.check.programs;

public class CheckStringIsPalindromeOrNot {

 	public static void main(String[] args) {
    String s1="saippuaki ikauppias";
    String s=s1.replace(" ", "");
    char[] c=s.toCharArray();
    int size=c.length;
    char[]rev=new char[size];
    for(int i=0;i<size;i++)
    {
    	rev[i]=c[size-1-i];
    }
    System.out.println(rev);
    for(int i=0;i<size;i++)
    {
    if(c[i]==rev[i])
    {

		   System.out.println("It is  palindrome");
		   System.exit(0);
	   }
	   else
	   {
		   i++;
		   continue;
	   }
	}
	System.out.println("It is a not palindrome");
	}
 	}

