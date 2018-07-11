package com.xuchao.bookmanager02.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xuchao.bookmanager02.mapper.BookTypeMapper;
import com.xuchao.bookmanager02.pojo.BookType;

@Service
public class BookTypeService {
	
	@Resource
	BookTypeMapper daoBookMapepr;
	
	
	public List<BookType> GetAllBookType()
	{
		return daoBookMapepr.getAllBookTypes();
	}
}
