package com.in28minutes.exceptionHandling;

public class ExceptionHandlingRunner2 {
	public static void main(String[] args) {
		extracted();
		System.out.println("Main ended");

	}

	static void extracted() {
		extracted2();
		System.out.println("Extracted ended");
	}

	static void extracted2() {
		try {
//			String str = null;
//			str.length();

			int[] i = { 1, 2 };
			int number = i[3];
			System.out.println("Extracted2 ended");
			// Most specific exception will throw
		} catch(NullPointerException ex) {
			System.out.println("NullPointerException");
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		}
		catch (Exception ex) {
			// Fallback exception
			ex.printStackTrace();

		}

	}

}