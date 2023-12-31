package com.boot.customer.Customer_Orders.models;

public class Customers {

	private int c_id;
	private String c_name;
	private String c_mobile;
	private String c_address;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_mobile() {
		return c_mobile;
	}

	public void setC_mobile(String c_mobile) {
		this.c_mobile = c_mobile;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	public Customers() {

	}

	public Customers(int c_id, String c_name, String c_mobile, String c_address) {

		this.c_id = c_id;
		this.c_name = c_name;
		this.c_mobile = c_mobile;
		this.c_address = c_address;
	}

}
