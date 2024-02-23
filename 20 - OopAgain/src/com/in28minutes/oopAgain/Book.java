package com.in28minutes.oopAgain;

import java.util.ArrayList;

public class Book {
	private int id;
	private String title;
	private String author;
	private ArrayList<BookReview> reviews = new ArrayList<BookReview>();

	public Book(int id, String title, String author) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	void addReview(BookReview review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("id = %d, title = %s, author = %s, reviews = [%s]", id, title, author, reviews);
	}

}
