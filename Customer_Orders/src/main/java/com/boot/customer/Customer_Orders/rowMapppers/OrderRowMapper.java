package com.boot.customer.Customer_Orders.rowMapppers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.boot.customer.Customer_Orders.models.Orders;

public class OrderRowMapper implements RowMapper<Orders> {

	@Override
	public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {

		Orders o = new Orders();

		o.setOrder_id(rs.getInt(1));
		o.setC_id(rs.getInt(2));
		o.setProduct_id(rs.getString(3));
		o.setProduct_name(rs.getString(4));
		o.setGst(rs.getInt(5));
		o.setProduct_price(rs.getInt(6));
		o.setOrder_address(rs.getString(7));
		return o;
	}

}
