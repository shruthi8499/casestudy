package com;

public class Cart {
	String user;
    int number_of_books;
    int totalamount;
	public Cart(String user, int number_of_books, int totalamount) {
		super();
		this.user = user;
		this.number_of_books = number_of_books;
		this.totalamount = totalamount;
	}
	public void cartdetails()
	{
		System.out.println("disply cart items");
	}

}
