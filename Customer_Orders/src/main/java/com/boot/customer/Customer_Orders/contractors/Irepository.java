package com.boot.customer.Customer_Orders.contractors;

import java.util.ArrayList;

import com.boot.customer.Customer_Orders.models.Customers;
import com.boot.customer.Customer_Orders.models.Orders;

public interface Irepository {

	ArrayList<Customers> getCustomers();

	ArrayList<Orders> getOrders();

	void Deleteitem(int id);

	void updateorder(Orders order);

	void addItem(Orders order);

	ArrayList<Orders> getCustomerId(int customerId);

}
