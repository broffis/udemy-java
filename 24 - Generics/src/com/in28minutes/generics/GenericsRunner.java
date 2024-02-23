package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();

		list.addElement("Element 1");
		list.addElement("Element 2");
		list.addElement("Element 3");
		String val = list.get(0);
		System.out.println(val);

		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(1));
		list2.addElement(Integer.valueOf(2));
		Integer val2 = list2.get(0);

		System.out.println(val2);

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		System.out.println(numbers);
		duplicate(numbers);
		System.out.println(numbers);

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.4, 5.5)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));

		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);

	}

	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}

		return sum;
	}

	static void addACoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

}
