package com.ex3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vo.Account;


@WebServlet("/accreg3")
public class AccReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AccReg() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int money = Integer.parseInt(request.getParameter("money"));
		HttpSession session = request.getSession();
		Account acc = (Account)session.getAttribute(id);
		if(acc==null) {
			session.setAttribute(id, new Account(id,name,money));
		} else {
			acc.setMoney(acc.getMoney()+money);
		}
//		RequestDispatcher rds = request.getRequestDispatcher("ex3/accmain.jsp");
//		rds.forward(request, response);
		response.sendRedirect("accmain"); // 얘가 살짝 더 가벼움, servlet이 적용되있을때만 사용하는게 좋음
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("ex3/accproduct.jsp").forward(request, response);
	}

}