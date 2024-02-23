package com.in28minutes.exceptionHandling;

import java.util.Scanner;

public class TryWithResourcesRunner {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Before Scanner Close");
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];
		}

//		Catch/Finally not needed when using resources
//		class Scanner implements Iterator<String>, Closeable
//		b/c it implements the "Closeable"
//		catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//		}

	}
}
