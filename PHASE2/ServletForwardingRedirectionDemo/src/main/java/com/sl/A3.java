package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// Demo servlet redirection

@WebServlet("/A3")
public class A3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();		
		
		// This output will go to the end user's browser, but the redirect will happen so fast 
		// that the user will not notice it being displayed
		
		out.println("<h2> 1.  Hi from servlet A3 </h2>");

		response.sendRedirect("B3");
		
		// below output will never reach the end user's browser because of above redirection
		out.println("<h2> 2.  Hi again from servlet A3 </h2>");
		
		out.close();
	}

}
