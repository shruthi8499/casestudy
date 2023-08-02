package com;

public class User {
	String username;
	String userid;
    double userphn_num;
    public User(String username,String userid, double userphn_num) {
        this.userid = userid;
        this.username = username;
        this.userphn_num = userphn_num;
    }
    public void viewdetails()
    {
    	System.out.println("View the user details");
    }


}

