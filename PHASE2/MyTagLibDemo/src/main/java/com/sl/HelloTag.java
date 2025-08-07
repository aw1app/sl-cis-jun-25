package com.sl;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		String salutation="Master";
		if(age>17)
			salutation="Mr";
		
		out.print("Hello, " + salutation + " " + name + "!");
	}
}
