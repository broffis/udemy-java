package com.in28minutes.exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		extracted();

	}

	static void extracted() {
		extracted2();
	}

	static void extracted2() {
		String str = null;
		str.length();
	}

}
