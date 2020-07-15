package com.yws.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	
	public void insert() {
		userDao.inesrt();
		System.out.println("===新增完毕==");
		int i = 10/0;

	}
}
