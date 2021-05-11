package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class input extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String result;
		int num = Integer.parseInt(req.getParameter("num"));
		
		if(num % 2 == 0) {
			result = "¦��";
		} else {
			result = "Ȧ��";
		}

		// request ������ model�̶� ������ ���� result���� �����Ѵ�. 
		req.setAttribute("model", result);
		RequestDispatcher dispatcher = req.getRequestDispatcher("input_result.jsp");
		dispatcher.forward(req, resp);
		
	}
	
}
