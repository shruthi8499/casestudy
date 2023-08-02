package com;

public class Book {
	String bookid;
	String author;
	String title;
    int price;
    public Book(String bookid, String author, String title, int price) {
		super();
		this.bookid = bookid;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public void displaybook()
    {
    	System.out.println("book details");
    }

}
