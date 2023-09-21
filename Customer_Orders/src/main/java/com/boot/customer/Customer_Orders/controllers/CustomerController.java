package com.boot.customer.Customer_Orders.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.customer.Customer_Orders.contractors.Irepository;
import com.boot.customer.Customer_Orders.models.Customers;
import com.boot.customer.Customer_Orders.models.Orders;

@RestController
public class CustomerController {

	@Autowired
	Irepository irep;

	// display all the customers
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ArrayList<Customers> getCustomers() {
		// List all the customers
		ArrayList<Customers> bp = irep.getCustomers();

		return bp;

	}

	// display all the orders
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public ArrayList<Orders> getOrders() {

		ArrayList<Orders> orderlist = irep.getOrders();
		Orders ba = orderlist.get(0);
		int a = ba.getC_id();

		return orderlist;

	}

	// add the items
	@RequestMapping(value = "/additem", method = RequestMethod.POST)
	public void additem(@RequestBody Orders order) {
		irep.addItem(order);

	}

	// display all the orders by customer id
	@RequestMapping(value = "/order/{c_id}", method = RequestMethod.GET)
	public ArrayList<Orders> getItems(@PathVariable("c_id") int customerId) {

		ArrayList<Orders> cutomerById = irep.getCustomerId(customerId);
		return cutomerById;

	}

	// delete the orders by order id
	@RequestMapping(value = "/deleteitem/{order_id}", method = RequestMethod.DELETE)
	public void deleteOrder(@PathVariable("order_id") int id) {
		irep.Deleteitem(id);

	}

	// update the orders by taking thr order_id as the input whicjh is unchangeable
	@RequestMapping(value = "/save/{order_id}", method = RequestMethod.PUT)
	public void updateOrder(@PathVariable("order_id") int id, @RequestBody Orders order) {
		irep.updateorder(order);

	}

}
