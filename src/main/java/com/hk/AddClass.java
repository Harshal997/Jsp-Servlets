package com.hk;     
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddClass extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		try {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a+b;
		// 2 ways to send data from one servlet to other.
		// 1. Session management(client side) 2. request dispatcher
//		PrintWriter out = res.getWriter();
//		out.println("Sum is: " + c);
//		req.setAttribute("c", c);
//		res.sendRedirect("sq?c="+c);   //URL Rewritting
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		Cookie cookie = new Cookie("c",c+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
//		HttpSession session = req.getSession();
//		session.setAttribute("c", c);
		
		System.out.println("Sum is: " + c);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

//<servlet>
//<servlet-name>abc</servlet-name>
//<servlet-class>com.hk.AddClass</servlet-class>
//</servlet>
//
//<servlet-mapping>
//<servlet-name>abc</servlet-name>
//<url-pattern>/add</url-pattern>
//</servlet-mapping>
//
//<servlet>
//<servlet-name>pqr</servlet-name>
//<servlet-class>com.hk.sqServlet</servlet-class>
//</servlet>
//
//<servlet-mapping>
//<servlet-name>pqr</servlet-name>
//<url-pattern>/sq</url-pattern>
//</servlet-mapping>
//
//<servlet>
//<servlet-name>xyz</servlet-name>
//<servlet-class>com.hk.MyServlet</servlet-class>
//
//<init-param>
//	<param-name>name</param-name>
//	<param-value>HKgreat</param-value>
//</init-param>
//
//</servlet>
//
//<servlet-mapping>
//<servlet-name>xyz</servlet-name>
//<url-pattern>/home</url-pattern>
//</servlet-mapping>
//
//<context-param>
//<param-name>name</param-name>
//<param-value>Harshal</param-value>
//</context-param>
//
//<context-param>
//<param-name>phone</param-name>
//<param-value>Oneplus</param-value>
//</context-param>
//
