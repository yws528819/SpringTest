package com.yws.tx;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jTemplate;
	
	public void inesrt() {
		String sql = "insert into user(name, age) values (?, ?)";
		
		String name = UUID.randomUUID().toString().substring(0,5);
		jTemplate.update(sql, name, 19);
	}
}
