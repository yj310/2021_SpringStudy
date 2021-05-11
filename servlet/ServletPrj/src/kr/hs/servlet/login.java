package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>login</title></head><body>");
		
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String[] hobby = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");

		out.print("<p>id: " + id + "</p>");
		out.print("<p>password: " + password + "</p>");
		out.print("<p>이름: " + name + "</p>");
		out.print("<p>취미: ");
		for(String s : hobby) {
			out.print(s + "    ");
		}
		out.print("</p>");
		out.print("<p>성별: " + gender + "</p>");
		out.print("<p>직업: " + job + "</p>");
		out.print("</body>");
	}
	
}
