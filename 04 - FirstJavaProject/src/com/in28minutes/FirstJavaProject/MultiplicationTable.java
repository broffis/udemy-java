package com.in28minutes.FirstJavaProject;

public class MultiplicationTable {
	void print() {
//		for (int i = 1; i<=10; i++) {
//			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
//		}
		print(5);
	}

	void print(int table) {
//		for (int i = 1; i<=10; i++) {
//			System.out.printf("%d * %d = %d", table, i, table * i).println();
//		}
		print(table, 1, 10);
	}

	void print(int table, int from, int to) {
		for (int i = from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}


}
