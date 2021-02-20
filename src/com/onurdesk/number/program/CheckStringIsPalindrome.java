package com.onurdesk.number.program;
//--------------------------------------------------

//20.Check String is Palindrome
//--------------------------------------------------

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		String str = "MAM";
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}

		System.out.println(revstring);

		if (revstring.equalsIgnoreCase(str)) {
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is Not a Palindrome");
		}

	}

}

//20.Program Output:
//----------------
//MAM 
//String is a Palindrome 