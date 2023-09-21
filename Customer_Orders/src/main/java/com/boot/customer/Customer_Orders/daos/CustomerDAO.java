package com.boot.customer.Customer_Orders.daos;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.boot.customer.Customer_Orders.contractors.IDao;
import com.boot.customer.Customer_Orders.models.Customers;
import com.boot.customer.Customer_Orders.models.Orders;
import com.boot.customer.Customer_Orders.rowMapppers.CustomerRowMapper;
import com.boot.customer.Customer_Orders.rowMapppers.OrderRowMapper;

@Component
public class CustomerDAO implements IDao {

	JdbcTemplate jdbc;

	@Autowired
	public CustomerDAO(DataSource dataSource) {
		jdbc = new JdbcTemplate(dataSource);
	}

	@Override
	public ArrayList<Customers> getCustomers() {

		return (ArrayList<Customers>) jdbc.query("select * from c_ustomers", new CustomerRowMapper());
	}

	@Override
	public ArrayList<Orders> getOrders() {

		return (ArrayList<Orders>) jdbc.query("select * from order_s", new OrderRowMapper());
	}

	@Override
	public void Deleteitem(int id) {

		jdbc.update("delete from order_s where order_id=" + id);
	}

	@Override
	public void updateorder(Orders order) {

		jdbc.update(
				"update order_s set product_id=?,product_name=?,gst=?,product_price=?,order_address=? where order_id=?",
				order.getProduct_id(), order.getProduct_name(), order.getGst(), order.getProduct_price(),
				order.getOrder_address(), order.getOrder_id());

	}

	@Override
	public void addItem(Orders order) {

		jdbc.update(
				"insert into order_s(order_id,c_id,product_id,product_name,gst,product_price,order_address) values(?,?,?,?,?,?,?)",
				order.getOrder_id(), order.getC_id(), order.getProduct_id(), order.getProduct_name(), order.getGst(),
				order.getProduct_price(), order.getOrder_address());

	}

	@Override
	public ArrayList<Orders> getCustomerId(int customerId) {

		return (ArrayList<Orders>) jdbc.query("select * from order_s where c_id=" + customerId, new OrderRowMapper());
	}

}
