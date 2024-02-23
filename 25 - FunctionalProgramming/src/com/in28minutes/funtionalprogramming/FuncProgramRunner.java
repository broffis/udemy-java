package com.in28minutes.funtionalprogramming;

import java.util.List;

public class FuncProgramRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

		printBasic(list);
		printWithFP(list);
		printWithFiltering(list);
		printWithFPWithFiltering(list);



		List<Integer> intList = List.of(1,4,7,9);
		intList.stream().forEach(el -> System.out.println("int - " + el));
		printOnlyOdds(intList);
		printOnlyEvens(intList);
	}

	static void printBasic(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

	static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println("element - " + element));
	}

	static void printWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println("filtered - " + string);
			}
		}
	}

	static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(el -> el.endsWith("at")).forEach(element -> System.out.println("fp filter - " + element));
	}

	static void printOnlyOdds(List<Integer> list) {
		list.stream().filter(i -> i % 2 == 1).forEach(el -> System.out.println("odds - " + el));
	}

	static void printOnlyEvens(List<Integer> list) {
		list.stream().filter(i -> i % 2 == 0).forEach(el -> System.out.println("evens - " + el));
	}

}
