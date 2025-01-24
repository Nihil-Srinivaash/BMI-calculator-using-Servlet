package com.jsp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class BMIResult extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//get the data
		double bmi=(Double)req.getAttribute("bmiindex");
		String message="";
		if(bmi<18) {
			message="Under Weight";
		}
		else if(bmi>=18 && bmi<25) {
		message="Normal";
		}
		else if(bmi>=25 && bmi<30) {
			message="Over Weight";
		}
		else
			message="obese";
		PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>BMI is"+bmi+"and outcome is"+message+"</h1>");
		pw.print("</body></html>");

	}
}
//run bmi.html