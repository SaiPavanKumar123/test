package com.boot.customer.Customer_Orders.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.boot.customer.Customer_Orders.contractors")
public class AppConfig {

	@Bean
	DataSource dataSource() {
		// get the database connection here
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:postgresql://192.168.110.48:5432/plf_training");
		driverManagerDataSource.setUsername("plf_training_admin");
		driverManagerDataSource.setPassword("pff123");
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		return driverManagerDataSource;

	}
}