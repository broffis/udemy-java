package com.in28minutes.generics;

import java.util.ArrayList;

public class MyCustomList<T> {
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T el) {
		list.add(el);
	}

	public void removeElement(T el) {
		list.remove(el);
	}

	public T get(int index) {
		return list.get(index);
	}
}
