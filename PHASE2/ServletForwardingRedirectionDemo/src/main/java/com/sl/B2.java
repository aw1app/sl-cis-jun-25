package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Demo servlet include

@WebServlet("/B2")
public class B2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		out.println("<h2> Hi from servlet B2 </h2>");
		
		// when any servlet's is being included in another servlet (like in this current case),
		// then do not close the PrintWriter.
		//out.close();
	}

}
