package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Demo session tracking using URL rewriting technique

@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		String sessId = request.getParameter("sessionId");

		// Response from Servlet B
		out.println(" <h1> Welcome to Amazon.com </h1>");
		out.println(" <h2> This is Servlet B web page </h2>");
		out.println(" <h3> Here is your session : " + sessId + "</h3>");

		out.close();
	}

}
