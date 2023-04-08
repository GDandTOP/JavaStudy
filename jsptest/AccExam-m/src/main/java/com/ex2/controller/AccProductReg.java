package com.ex2.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vo.Account;

/**
 * Servlet implementation class AccProductReg
 */
@WebServlet("/accreg")
public class AccProductReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private HashMap<String, Account> accs = new HashMap<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccProductReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int money = Integer.parseInt(request.getParameter("money"));
		if(accs.containsKey(id)) {  //이미 동일한 계좌가 있으면
			Account acc = accs.get(id);
			acc.setMoney(acc.getMoney()+money);
		} else {
			accs.put(id, new Account(id,name,money));
		}
		
		request.setAttribute("accs", accs);
		RequestDispatcher rds = request.getRequestDispatcher("ex2/acclist.jsp");
		rds.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ex2/accproduct.jsp").forward(request, response);
	}
}
