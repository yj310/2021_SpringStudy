package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/printInfo")
public class PrintInfo extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<html><head><title>printInfo</title></head><body>");
		out.print("<p>req.getRequestURI(): " + req.getRequestURI() + "</p>");
		out.print("<p>req.getServerName(): " + req.getServerName() + "</p>");
		out.print("<p>req.getServerPort(): " + req.getServerPort() + "</p>");
		out.print("<p>req.getRemoteAddr(): " + req.getRemoteAddr() + "</p>");
		out.print("<p>req.getRemoteHost(): " + req.getRemoteHost() + "</p>");
		out.print("<p>req.getRemotePort(): " + req.getRemotePort() + "</p>");
		out.print("</body></html>");
		
	}
	
}
