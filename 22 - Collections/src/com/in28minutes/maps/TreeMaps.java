package com.in28minutes.maps;

import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.put("F", 25);
		treemap.put("Z", 5);
		treemap.put("L", 250);
		treemap.put("A", 15);
		treemap.put("B", 25);
		treemap.put("G", 25);

		System.out.println(treemap); // {A=15, B=25, F=25, G=25, L=250, Z=5}

		treemap.higherKey("B"); // "F" only >
		treemap.higherKey("C"); // "F"
		treemap.ceilingKey("B"); // "B" >=
		treemap.lowerKey("B"); // "A" <
		treemap.floorKey("B"); // "B" <=
		treemap.firstEntry(); // "A"
		treemap.lastEntry(); // "Z"

		treemap.subMap("C", "Y"); // {F=25, G=25, L=250}
		treemap.subMap("B", "Z"); // {B=25F=25, G=25, L=250} -> includes lower limit, excludes upper limit
		treemap.subMap("B", true, "Z", true); // {B=25F=25, G=25, L=250, Z=5} -> decide if you want to include either

	}

}
