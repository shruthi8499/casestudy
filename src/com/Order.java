package com;

public class Order {
	String orderid;
	int number_of_books;
	String orderissued;
	int amount;
	public Order(String orderid, int number_of_books, String orderissued, int amount) {
		super();
		this.orderid = orderid;
		this.number_of_books = number_of_books;
		this.orderissued = orderissued;
		this.amount = amount;
	}
	public void vieworder()
	{
		System.out.println("Display order details");
	}
	public void calculateamount()
	{
		System.out.println("Display total amount");
	}
	

}
