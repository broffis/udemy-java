package com.in28minutes.arrays;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student({ 78, 92, 99, 100, 75});

//		int[] marks = { 78, 92, 99, 100, 75, 92, 81 };

//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}

//		System.out.println(Arrays.toString(marks));

		Student student = new Student("Brandon", 78, 92, 99, 100, 75, 92, 81);

		System.out.println("Total Sum: " + student.getTotalSumOfMarks());
		System.out.println("Count: " + student.getNumberOfMarks());
		System.out.println("Max: " + student.getMaximumMark());
		System.out.println("Min: " + student.getMinimumMark());
		System.out.println("Avg: " + student.getAverageMark());


	}

}
