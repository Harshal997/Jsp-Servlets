package com.hk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi<br>");
		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		String phone = context.getInitParameter("phone");
		ServletConfig config = getServletConfig();
		String name1 = config.getInitParameter("name");
		out.print(name + " " + name1);
	}

}
