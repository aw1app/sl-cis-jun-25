package com.sl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

// Session Tracking using HttpSession

@WebServlet("/ServletA")
public class ServletA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true); // true will ensure if a session is not present, then create a
														// new session.

		// Response from Servlet A
		out.println(" <h1> Welcome to Amazon.com </h1>");
		out.println(" <h2> This is Servlet A web page </h2>");

		out.println(" <p> Just now created a brand new http Session or retrieved an existing one </p>");
		out.println(" <p> Session Id is  </p>" + session.getId());

		out.close();

	}

}
