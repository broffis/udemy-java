package com.in28minutes.referenceTypes;


public class WrapperClasses {

	public static void main(String[] args) {
		// Wrapper: Boolean, Byte, Character, Double, Float, Integer, Long, Short
		// Primitive: boolean, byte, char, double, float, int, long, short

//		autoBoxing();

		System.out.println(upperCaseCounter("HellO WoRlD"));

	}

	static void introToWrappers() {
//		Integer int = new Integer(5);
//
//		Integer int1 = new Integer(5);

//		Float flt = new Float(55.0);

	}

	static void autoBoxing() {
		// Uses the `.valueOf()` method to compare existing values
		Integer seven = 7;
		Integer sevenAgain = 7;

		System.out.println(seven == sevenAgain);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
	}

	static int upperCaseCounter(String str) {
		if (str == null) {
			return 0;
		}

		int totalUpperCase = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				totalUpperCase += 1;

			}
		}

		return totalUpperCase;
	}

}
