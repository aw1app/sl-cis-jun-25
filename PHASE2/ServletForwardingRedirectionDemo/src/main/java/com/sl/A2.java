package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// Demo servlet include

@WebServlet("/A2")
public class A2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();		
		
		out.println("<h2> 1.  Hi from servlet A2 </h2>");

		// Let's forward to servlet B2
		RequestDispatcher dispatcher = request.getRequestDispatcher("/B2");
		dispatcher.include(request, response);
		
		out.println("<h2> 2.  Hi again from servlet A2 </h2>");
		
		out.close();
	}

}
