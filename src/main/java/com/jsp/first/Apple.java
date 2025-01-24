package com.jsp.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* bmi-body masss index
 * height
 * weight
 * 
 */
@WebServlet("/calculate")
public class Apple extends HttpServlet{
	@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
// read data from form
	String height=req.getParameter("personHeight");
	String weight=req.getParameter("personWeight");
    //calculate bmi-weight/(height*height);
	//convert string to double
	
	double height1=Double.parseDouble(height);
	double weight1=Double.parseDouble(weight);
	
	double bmi=weight1/(height1*height1);
	
	//transfer data--bmi
	
	req.setAttribute("bmiindex", bmi);

	//transferring request
	RequestDispatcher dispatcher=req.getRequestDispatcher("result");
	dispatcher.forward(req, res);
	
}
}
