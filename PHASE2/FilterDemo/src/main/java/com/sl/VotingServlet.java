package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class VotingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("INSIDE VotingServlet doGet() ");
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();			

		out.println("<h2> You are eligible to Vote </h2>");
		out.println("<h3> You are voting slip from City Hall.</h3>");

		out.close();

	}

}
