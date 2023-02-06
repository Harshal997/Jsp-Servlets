package com.hk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class sqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int c = Integer.parseInt(req.getParameter("c"));
//		HttpSession session = req.getSession();
//		int c = (int)session.getAttribute("c");
		int c = 0;
		Cookie cookie[] = req.getCookies();
		for(Cookie x:cookie) 
			if(x.getName().equals("c")) c = Integer.parseInt(x.getValue());
		c = c*c;
		PrintWriter out = res.getWriter();
	    out.println("Square is: " + c);
		System.out.println("Sq called");
	}

}
