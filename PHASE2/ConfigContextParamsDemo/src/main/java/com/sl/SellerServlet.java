package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String sellerName ="";

	public void init(ServletConfig config) {
		System.out.println("Inside init()");

		sellerName = config.getInitParameter("seller-name");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<h1>Welcome to "+ sellerName  +"</h1>");

		out.close();

	}

}
