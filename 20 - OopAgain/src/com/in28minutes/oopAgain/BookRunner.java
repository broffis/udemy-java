package com.in28minutes.oopAgain;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOP with Java", "Ranga");

		book.addReview(new BookReview(1, "Good book", (byte) 5));
		book.addReview(new BookReview(2, "Boring book", (byte) 1));

		System.out.println(book);

	}

}
