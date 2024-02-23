package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;

	Student(String name, int... marks) {
		this.name = name;
//		this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	int getNumberOfMarks() {
		return marks.size();
	}

	int getTotalSumOfMarks() {
		int sum = 0;

		for (int mark : marks) {
			sum += mark;
		}

		return sum;
	}

	int getMaximumMark() {
//		int[] sorted = marks;
//		Arrays.sort(sorted);
//
//		return sorted[sorted.length - 1];

//		int maximum = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//
//		return maximum;

		return Collections.max(marks);
	}

	int getMinimumMark() {
//		int[] sorted = marks;
//		Arrays.sort(sorted);
//
//		return sorted[0];

//		int minimum = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//
//		return minimum;
		return Collections.min(marks);
	};

	BigDecimal getAverageMark() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 2, RoundingMode.DOWN);
	};

	void addNewMark(int mark) {
		marks.add(mark);

	}

	void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
