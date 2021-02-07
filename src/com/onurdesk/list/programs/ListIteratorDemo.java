package com.onurdesk.list.programs;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("Mayur");
		ll.add("Rajiv");
		ll.add("Navjyot");
		ll.add("Paresh");
		System.out.println(ll);
		ListIterator itr=ll.listIterator();
		while(itr.hasPrevious())
		{
			/*
			 * String s=(String)itr.next(); if(s.equals("Kojay")) { itr.add("Om Prakash"); }
			 */
			String s=(String)itr.previous();
			
			System.out.println(s);
		}
	}

}