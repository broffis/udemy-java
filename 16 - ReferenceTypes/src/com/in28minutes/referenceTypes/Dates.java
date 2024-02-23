package com.in28minutes.referenceTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		LocalTime lc = LocalTime.now();
		System.out.println(lc);

		localDatePlayer();

		localDateTester();

	}

	static void localDatePlayer() {
		LocalDate today = LocalDate.now();

		System.out.println(today.getYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.isLeapYear());
		System.out.println(today.lengthOfYear());
		System.out.println(today.plusDays(100));
		System.out.println(today.plusMonths(21));

	}

	static void localDateTester() {
		LocalDate yesterday = LocalDate.of(2024, 2, 18);
		System.out.println(yesterday);

		System.out.println(yesterday.withDayOfYear(123));

		LocalDate today = LocalDate.now();

		System.out.println(today.isBefore(yesterday));
		System.out.println(today.isAfter(yesterday));
	}

}
