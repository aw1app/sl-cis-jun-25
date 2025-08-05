package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		
		String userName = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		
		// some dummy check
		if(userName.equalsIgnoreCase("admin") && passwd.equals("00000000")) {
			HttpSession session  = request.getSession(true);
			
			session.setAttribute("authenticated", true);
			
			out.println("<b> you have successfully logged in !");
		}else {
			out.println("<b> Username/Password you provided don't match !");
		}
		
		out.close();

	}

}
