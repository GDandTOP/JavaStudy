package com.ex3.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;


@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		int amount = Integer.parseInt(request.getParameter("amount"));
		HttpSession session = request.getSession();
		
		Product product = (Product)session.getAttribute(id);
		if(product==null) {
			session.setAttribute(id, new Product(name,id,amount));
		} else {
			product.setAmount(product.getAmount()+amount);
		}

		response.sendRedirect("main");
	}

}
