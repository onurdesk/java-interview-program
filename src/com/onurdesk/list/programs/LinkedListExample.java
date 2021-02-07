package com.onurdesk.list.programs;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample 
{

	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>(Arrays.asList("apple","banana","banana"));
		ll.add(1,"fruit");
		System.out.println(ll);
		ListIterator<String> list=ll.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		
		}
		
	}

}
