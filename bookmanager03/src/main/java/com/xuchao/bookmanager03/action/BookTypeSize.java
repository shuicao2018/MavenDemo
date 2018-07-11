package com.xuchao.bookmanager03.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xuchao.bookmanager03.service.BookTypeService;

/**
 * Servlet implementation class BookTypeSize
 */
@WebServlet("/BookTypeSize.do")
public class BookTypeSize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 BookTypeService bookTypeService;
	
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		bookTypeService=CtxUtil.getBean(BookTypeService.class);
		
		
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public BookTypeSize() {
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
