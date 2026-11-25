package dev.felipeazsantos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/addition")
public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if ( request.getParameter("number1") != null && request.getParameter("number2") != null) {
			Long number1 = Long.parseLong(request.getParameter("number1"));
			Long number2 = Long.parseLong(request.getParameter("number2"));
			
			PrintWriter out = response.getWriter();
			out.println("The Result is " + (number1 + number2));
		}
		
	}

}
