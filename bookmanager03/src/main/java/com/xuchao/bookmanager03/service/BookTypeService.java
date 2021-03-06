package com.xuchao.bookmanager03.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xuchao.bookmanager03.mapper.*;
import com.xuchao.bookmanager03.pojo.*;

@Service
public class BookTypeService {
	
	@Resource
	BookTypeMapper daoBookMapepr;
	
	
	public List<BookType> GetAllBookType()
	{
		return daoBookMapepr.getAllBookTypes();
	}
	
	@Transactional
	public int Add(List<BookType> newBookTypes)
	{
		int rows=0;
		for(BookType booktype : newBookTypes)
		{
			daoBookMapepr.addBookType(booktype);
			rows++;
			
		}
		return rows;
	}
	
}
