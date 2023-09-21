package com.boot.customer.Customer_Orders.repositories;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.customer.Customer_Orders.contractors.IDao;
import com.boot.customer.Customer_Orders.contractors.Irepository;
import com.boot.customer.Customer_Orders.models.Customers;
import com.boot.customer.Customer_Orders.models.Orders;

@Component
public class CustomerRepository implements Irepository {

	@Autowired
	IDao idao;

	@Override
	public ArrayList<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return idao.getCustomers();
	}

	@Override
	public ArrayList<Orders> getOrders() {
		// TODO Auto-generated method stub
		return idao.getOrders();
	}

	@Override
	public void Deleteitem(int id) {

		idao.Deleteitem(id);

	}

	@Override
	public void updateorder(Orders order) {

		idao.updateorder(order);
	}

	@Override
	public void addItem(Orders order) {

		idao.addItem(order);

	}

	@Override
	public ArrayList<Orders> getCustomerId(int customerId) {

		return idao.getCustomerId(customerId);
	}

}
