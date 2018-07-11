package com.xuchao.bookmananger02.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.xuchao.bookmanager02.service.BookTypeService;

/**
 * Servlet implementation class BookTypeList
 */
@WebServlet("/BookTypeList.do")
public class BookTypeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  BookTypeService bookTypeService;
	  

	
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
		
	      //�ڵ�ǰ�������л��Spring����
	      WebApplicationContext ctx=WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	      //�������л��bean
	      bookTypeService=ctx.getBean(BookTypeService.class);
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public BookTypeList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	      PrintWriter writer=response.getWriter();
	        writer.print(bookTypeService.GetAllBookType().size());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}