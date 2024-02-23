package com.in28minutes.oops;

public class Book {
	// state
	private int numOfCopies;

	void setNumOfCopies(int num) {
		this.numOfCopies = num;
	}

	void stockMoreCopies(int num) {
		if (num > 0) {
			this.setNumOfCopies(this.numOfCopies + num);
		}
	}

	void removeCopies(int num) {
		if (num > 0) {
			this.setNumOfCopies(this.numOfCopies - num);
		}
	}
}
