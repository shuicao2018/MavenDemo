package com.xuchao.bookmanager02.mapper;

import java.util.List;

import com.xuchao.bookmanager02.pojo.BookType;

public interface BookTypeMapper {

	List<BookType> getAllBookTypes();
	void addBookType (BookType bookType);
	
	
}
