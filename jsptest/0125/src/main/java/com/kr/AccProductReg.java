package com.kr;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kr.vo.Account;


@WebServlet("/accreg")
public class AccProductReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, Account> accs = new HashMap<>();

    public AccProductReg() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int money  = Integer.parseInt(request.getParameter("id")); 
		
		if(accs.containsKey(id)) { // 이미 동일한 계좌가 있으면 
			Account acc = accs.get(id);
			acc.setMoney(acc.getMoney()+money);
		} else {
			accs.put(id, new Account(id,name,money));
		}
		
		request.setAttribute("accs", accs.values());
		RequestDispatcher rds = request.getRequestDispatcher("acclist.jsp");
		rds.forward(request, response);
	}

}
