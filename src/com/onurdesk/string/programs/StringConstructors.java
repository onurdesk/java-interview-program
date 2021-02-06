package com.onurdesk.string.programs;

public class StringConstructors {

	public static void main(String[] args) {
		// 1 Creates an empty StringBuffer object with default initialcapacity "16".
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());

		sb.append("q");
		System.out.println(sb.capacity());

		sb.append("abcdefghijklmnopqi");
		System.out.println(sb.capacity());

		// 2 Creates an empty StringBuffer object with the specified initial capacity
		StringBuffer sb1 = new StringBuffer(9);
		System.out.println(sb1.capacity());

		// 3 Creates an equivalent StringBuffer object for the given
		// String with capacity=s.length()+16;
		StringBuffer sb2 = new StringBuffer("java");
		System.out.println(sb2.capacity());

	}

}
