package com.ex2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Product;


@WebServlet("/productReg")
public class ProductRegistrationServlet extends HttpServlet {

	private HashMap<String, Product> products = new HashMap<String, Product>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = (String)request.getParameter("name");
		String id = (String)request.getParameter("id");
		int amount = Integer.parseInt((String)request.getParameter("amount"));
		
		
		if(products.containsKey(id)) {
			Product product = products.get(id);
			product.setAmount(product.getAmount()+amount);
		} else {
			products.put(id, new Product(name,id,amount));
		}
		
		request.setAttribute("products", products);
		
		RequestDispatcher rds = request.getRequestDispatcher("ex2/productInfo.jsp");
		rds.forward(request, response);
		
			
	}
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ex2/productForm.jsp").forward(request, response);
			
	}
}
