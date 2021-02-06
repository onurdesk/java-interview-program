package com.onurdesk.count.programs;
import java.util.Scanner;

public class CountNoOfVowelsInString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any String");
		String ss=s.next();
		char []ch=ss.toCharArray();
		int size=ch.length;
		int count=0;
		int i=0;
		while(i!=size) {
			
		
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
		  count++;	
	
		
		}
		}
		System.out.println("No.Of vowles are "+count);
	
	}
}
	
