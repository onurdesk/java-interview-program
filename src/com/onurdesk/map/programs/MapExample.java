package com.onurdesk.map.programs;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(100, "OMpraksh");
		System.out.println(map);
		map.put(100, "Shiva");
		System.out.println(map);
	}

}
