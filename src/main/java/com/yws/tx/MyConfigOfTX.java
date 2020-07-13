package com.yws.tx;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@ComponentScan("com.yws.tx")
@Configuration
public class MyConfigOfTX {
	@Bean
	public DataSource dataSourceTest()  throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
