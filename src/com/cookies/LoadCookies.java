package com.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoadCookies
 */
@WebServlet("/LoadCookies")
public class LoadCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		Cookie ck[] = request.getCookies();
		
		
		response.getWriter().println(ck[0].getValue());
	}
}