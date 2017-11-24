package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet{
	
	public void doPost(HttpServletRequest request,
				HttpServletResponse response)throws IOException,ServletException{
					
				String c = request.getParameter("color");
				
				BeerExpert be = new BeerExpert();
				List brands = be.getBrands(c);
				
					
				//response.setContentType("text/html");
				//PrintWriter out = response.getWriter();
				//out.println("Beer Selection advice<br>");
				
				request.setAttribute("styles",brands);
				
				RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
				
				rd.forward(request,response);
	}
	
	
	
}