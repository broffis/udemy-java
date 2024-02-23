package com.in28minutes.maps;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();
		for (char character : characters) {
			// Get the character
			Integer integer = occurances.get(character);
			if (integer == null) {
				// if it is not in map, initialize to 1
				occurances.put(character, 1);
			} else {
				// if it is in Map, increment count
				occurances.put(character, integer + 1);
			}
		}

		System.out.println(occurances); // { =9, a=5, b=1, c=2, d=1, e=8, f=1, h=4, i=4, m=1, n=4, .=1, o=4, p=2, r=2,
										// s=6, T=2, v=1, w=1}

		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] words = str.split(" ");
		for (String word : words) {
			// Get the character
			Integer integer = stringOccurances.get(word);
			if (integer == null) {
				// if it is not in map, initialize to 1
				stringOccurances.put(word, 1);
			} else {
				// if it is in Map, increment count
				stringOccurances.put(word, integer + 1);
			}
		}

		System.out.println(stringOccurances); // {awesome=1, never=1, occasion.=1, before=1, This=2, is=1, has=1, an=1,
												// happened=1}
	}

}
