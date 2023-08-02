package com;

public class Payment {
	String paymentid;
    String order;
    int amount;
    String paymentStatus;
    public Payment(String paymentid, String order, int amount, String paymentStatus) {
		super();
		this.paymentid = paymentid;
		this.order = order;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
	}
    public void displaypaymentdetals()
    {
    	System.out.println("Payment details");
    }
	

}
