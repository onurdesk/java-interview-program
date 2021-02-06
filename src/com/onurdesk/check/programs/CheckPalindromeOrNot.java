package com.onurdesk.check.programs;
import java.util.Scanner;

public class CheckPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		if (isPalindrome(str)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not palindrome");

		}
		System.out.println("=============================");
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (palindrome(num) == num) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("it is not pakindrome");
		}
	}

	// in number Palindrome and Reverse a number
	private static int palindrome(int num) {
		int rev = 0;

		while (num > 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	// in String Palindrome
	private static boolean isPalindrome(String str) {
		char str1[] = str.toCharArray();
		int size = str1.length-1;
		System.out.println(size);

		for (int i = 0; i <= size; i++)
		{
			if (str1[i] != str1[size]) 
			{
				return false;
			}
			size--;
		}
		return true;
	}

}
