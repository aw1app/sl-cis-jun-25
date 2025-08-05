package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//Demo servlet forwarding

@WebServlet("/A")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("1. INSIDE Servlet A doGet() ");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		// this one will not be sent to the client (end user) because when you forward the request, the control
		// will go to the forwarded servlet and no output from this servlet will reach the client
		out.println("<h2> Hi from servlet A </h2>");

		// Let's forward to servlet B
		RequestDispatcher dispatcher = request.getRequestDispatcher("/B");
		dispatcher.forward(request, response);
		
		System.out.println("2. INSIDE Servlet A doGet() ");
		
		out.close();
	}

}
