package com.in28days.loops;

public class WhileLoops {
	private int num;

	WhileLoops(int num) {
		this.num = num;
	}

	void printSquaresUpToLimit() {
		int i = 1;
		while (i * i <= num) {
			System.out.print(i * i + " ");
			i++;
		}
		System.out.println();
	}

	void printCubessUpToLimit() {
		int i = 1;
		while ((i * i * i) <= num) {
			System.out.print(i * i * i + " ");
			i++;
		}
		System.out.println();
	}

}
