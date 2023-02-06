package com.hk;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String pass = request.getParameter("pass");
		System.out.print(uname + " " + pass);
		
		if(uname.equals("Harshal") && pass.equals("1234")) {
			response.sendRedirect("welcome.jsp");
		}
	}

}