package com.xuchao.bookmanager02.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.xuchao.bookmanager02.pojo.BookType;

public class BookTypeSessionService {
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

    public List<BookType> getAllBookTypes() {
        return sqlSession.selectList("com.xuchao.bookmanager02.mapper.BookTypeMapper.getAllBookTypes");
    }
	
}
