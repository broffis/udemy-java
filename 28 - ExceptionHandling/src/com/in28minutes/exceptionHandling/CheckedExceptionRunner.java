package com.in28minutes.exceptionHandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
//		handleWithTryCatch();

		someOtherMethod();


	}

	static void handleWithTryCatch() {
		try {
			throwTheException();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void throwTheException() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
	}

	private static void someOtherMethod() throws RuntimeException {

	}

}
