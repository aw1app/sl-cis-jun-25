package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String companyInfo ="";

	public void init(ServletConfig config) {

		companyInfo = config.getInitParameter("company-info");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		String dbUserName = request.getServletContext().getInitParameter("dbuser-name");
		System.out.println("dbUserName="+dbUserName);

		out.println("<h2>This company is "+ companyInfo  +"</h2>");

		out.close();

	}

}
