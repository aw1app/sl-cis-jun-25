package com.sl.filter;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class VotingFilter extends HttpFilter {
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("INSIDE VotingFilter doFilter() ");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String strAge  = request.getParameter("age");
		int age = Integer.parseInt(strAge);
		
		if (age< 18) {
			out.print("You are NOT eleible to Vote");
		}
		
		else {
			chain.doFilter(request, response);
		}
		
	}

}
