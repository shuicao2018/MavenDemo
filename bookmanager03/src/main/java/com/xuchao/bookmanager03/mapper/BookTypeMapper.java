package com.xuchao.bookmanager03.mapper;

import java.util.List;

import com.xuchao.bookmanager03.pojo.*;
public interface BookTypeMapper {

	List<BookType> getAllBookTypes();
	void addBookType (BookType bookType);
	
	
}
