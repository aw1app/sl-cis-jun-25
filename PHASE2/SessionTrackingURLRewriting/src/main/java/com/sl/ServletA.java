package com.sl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Demo session tracking using URL rewriting technique

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Random random = new Random();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int sessionId = random.nextInt();
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// Response from Servlet A
		out.println(" <h1> Welcome to Amazon.com </h1>");
		out.println(" <h2> This is Servlet A web page </h2>");
		
		String contextURL = request.getServletContext().getContextPath();
		out.println(" <a href=\"" +contextURL + "/ServletB?sessionId=" + sessionId + "\" > Click here to go to Servlet B </a>");
		

		out.close();
	}

}
