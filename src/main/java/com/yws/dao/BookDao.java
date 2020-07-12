package com.yws.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
    
	private String label = "1";

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "BookDao [label=" + label + "]";
	}
	
	public void query() {
		Integer cnt = jdbcTemplate.queryForObject("select count(1) from dual", Integer.class);
		System.out.println(cnt);
	}
	
	
}
