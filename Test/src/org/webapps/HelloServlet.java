package org.webapps;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	@javax.ejb.EJB
	private HelloBean bean;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		final java.io.Writer writer = response.getWriter();
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>Hello "+bean.from()+" </h1>");
		writer.append("</body>");
		writer.append("</html>");
	}

}
