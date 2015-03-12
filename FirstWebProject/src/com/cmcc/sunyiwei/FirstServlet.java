package com.cmcc.sunyiwei;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.txw2.Document;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		PrintWriter pWriter = response.getWriter();
		pWriter.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		pWriter.println("<HTML>");
		pWriter.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		pWriter.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
		pWriter.println("<BODY>");

		String requestURIString = request.getRequestURI();
		pWriter.println("<form action='" + requestURIString
				+ "' method='post'>");
		pWriter.println("请输入你的名字: <input type='text' name='name' />");
		pWriter.println("<input type='submit' />");
		pWriter.println("</form>");
		pWriter.println("");

		String name = request.getParameter("name");
		if (name != null && name.trim().length() > 0) {
			pWriter.println("您好, <b>" + name + "</b>.");
		}

		pWriter.println("</BODY>");
		pWriter.println("</HTML>");

		pWriter.flush();
		pWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
