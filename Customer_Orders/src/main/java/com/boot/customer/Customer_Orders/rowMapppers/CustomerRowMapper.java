package com.boot.customer.Customer_Orders.rowMapppers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.boot.customer.Customer_Orders.models.Customers;

public class CustomerRowMapper implements RowMapper<Customers> {

	@Override
	public Customers mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customers c = new Customers();

		c.setC_id(rs.getInt(1));
		c.setC_name(rs.getString(2));
		c.setC_mobile(rs.getString(3));
		c.setC_address(rs.getString(4));

		return c;
	}

}
