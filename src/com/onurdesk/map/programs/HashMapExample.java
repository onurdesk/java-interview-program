package com.onurdesk.map.programs;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> hp=new HashMap<>();
		hp.put("omprakash",100);
		hp.put("Satya",104);
		System.out.println(hp.put("omprakash",140));
        hp.put("raju",110);
        System.out.println(hp);
        System.out.println(hp.containsKey("Satya"));
        System.out.println(hp.containsValue(110));
		System.out.println(hp.isEmpty());
		System.out.println(hp.remove("omprakash",140));
		System.out.println(hp);
	}

}
