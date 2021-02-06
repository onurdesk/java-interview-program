package com.onurdesk.string.programs;

import java.nio.charset.Charset;
import java.util.Arrays;

public class StringToByte {

	public static void main(String[] args) {
		String s = "coding is my habit";
		byte[] b = s.getBytes();
		String str1 = new String(b);
		System.out.println(Arrays.toString(b));

	}

}
