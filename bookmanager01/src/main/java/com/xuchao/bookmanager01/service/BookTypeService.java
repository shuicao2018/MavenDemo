package com.xuchao.bookmanager01.service;

import java.util.List;

import com.xuchao.bookmanager01.mapper.BookTypeMapper;
import com.xuchao.bookmanager01.pojo.*;
public class BookTypeService {

	private BookTypeMapper daoBookType;

	public BookTypeMapper getDaoBookType() {
		return daoBookType;
	}

	public void setDaoBookType(BookTypeMapper daoBookType) {
		this.daoBookType = daoBookType;
	}
	
	public List<BookType> GetBookTypes()
	{
	
		return daoBookType.getAllBookTypes();
		
	}
	
}
