package com.in28minutes.oopAgain;

public class Rectangle {
	private int length;
	private int width;

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	int getLength() {
		return this.length;
	}

	void setLength(int l) {
		this.length = l;
	}

	int getWidth() {
		return this.width;
	}

	void setWidth(int w) {
		this.width = w;
	}

	int area() {
		return length * width;
	}

	int perimiter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return String.format("length - %d, width - %d, area - %d, perimeter - %d", length, width, area(), perimiter());
	}

}
