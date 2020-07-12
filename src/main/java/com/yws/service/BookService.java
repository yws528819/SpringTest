package com.yws.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yws.dao.BookDao;

@Service
public class BookService {

	@Qualifier("bookDao")
	@Autowired(required = false)
	//@Resource
	//@Inject
	private BookDao bookDao2;

	public BookDao getBookDao() {
		return bookDao2;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao2 = bookDao;
	}

	@Override
	public String toString() {
		return "BookService [bookDao=" + bookDao2 + "]";
	}
	
	
}
