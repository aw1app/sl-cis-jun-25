package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// Session Tracking using HttpSession

@WebServlet("/ServletB")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false); // false will ensure if a session is not present, then it will
															// return null and not create a new session

		// Response from Servlet B
		out.println(" <h1> Welcome to Amazon.com </h1>");
		out.println(" <h2> This is Servlet B web page </h2>");
		out.println(" <h3> Here is your session ID : " + (session!=null ? session.getId() : null )+ "</h3>");

		out.close();

	}

}
