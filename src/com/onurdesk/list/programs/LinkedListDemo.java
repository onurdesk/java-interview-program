package com.onurdesk.list.programs;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("Onurdesk");
		l.add(30);
		l.add(null);
		l.add("For all your desire ");
		System.out.println(l);

		l.set(0, "Software");
		System.out.println(l);

		l.removeLast();
		System.out.println(l);

		l.addFirst("Onurdesk");
		System.out.println(l);
	}

}
