package com.in28minutes.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		introToLists();
		listSorting();

	}

	static void introToLists() {
		List value = List.of("A", 'A', 1, 1.0);

		System.out.println(value.get(2));
		System.out.println(value.get(2) instanceof Integer);

//		Fails b/c of type guard
//		List<String> textValues = List.of("A", 'A', 1, 1.0);

		List<Integer> numbers = List.of(101, 102, 103, 104, 105);
		System.out.println(numbers.indexOf(103));

		List<Integer> numbersAl = new ArrayList<>(numbers);
		System.out.println(numbersAl.indexOf(103));

//		Fails due to autoboxing of 103 to int
//		numbersAl.remove(103);

		numbersAl.remove(Integer.valueOf(103));
		System.out.println(numbersAl);
	}

	static void listSorting() {
		List<Integer> numbers = List.of(123, 12, 2, 45);
		List<Integer> numbersAl = new ArrayList<>(numbers);

		System.out.println(numbersAl);
//		numbersAl.sort(); // => needs a comparator

		Collections.sort(numbersAl);
		System.out.println(numbersAl);
	}

}
