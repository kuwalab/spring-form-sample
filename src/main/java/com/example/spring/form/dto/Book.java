package com.example.spring.form.dto;

public class Book {
	private String isbn;
	private String title;

	// コンストラクタ/setter/getterは省略

	public Book() {
	}

	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
