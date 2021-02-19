package com.onurdesk.list.programs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add("A");
		a.add(10);
		a.add('A');
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2, "M");
		System.out.println(a);
		a.add("n");
		System.out.println(a);

		ArrayList a1 = new ArrayList();
		LinkedList a2 = new LinkedList();

		System.out.println(a1 instanceof Serializable); // true
		System.out.println(a2 instanceof Cloneable); // true

		System.out.println(a1 instanceof RandomAccess); // true
		System.out.println(a2 instanceof RandomAccess); // false

		List l1 = Collections.synchronizedList(a);

	}

}
