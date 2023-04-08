package com.ex3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vo.Account;


@WebServlet("/accdelete")
public class AccDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AccDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("ex3/accdelete.jsp").forward(request, response);
//	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf8");
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		Account acc = (Account)session.getAttribute(id);
		
		if(acc!=null) {
			session.removeAttribute(id);
			response.sendRedirect("acclist");
		} else {
			request.getRequestDispatcher("ex3/error.jsp").forward(request, response);
		}
		


	}
}
