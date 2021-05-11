package kr.hs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/odd")
public class Odd extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>홀짝판별</title></head><body>");
		int a = 4;
		// a의 홀짝 판별 후 브라우저에 출력
		if(a % 2 == 0) {
			out.print("<p>" + a + " 은(는) 짝수입니다. </p>");
		} else {
			out.print("<p>" + a + " 은(는) 홀수입니다. </p>");
		}
		out.print("</body></html>");
		
		
	}
	
}
