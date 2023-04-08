package com.kr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookieexam")
public class CookieExam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CookieExam() {
        super();

    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String language = request.getParameter("Language");
		Cookie cookie = new Cookie("language",language);
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		
		response.sendRedirect("cookieExam.jsp");
	}

}
