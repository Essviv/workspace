package com.cmcc.sunyiwei;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestRIServlet
 */
@WebServlet("/TestRIServlet")
public class TestRIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//注入的字符串
	private @Resource(name="hello") String szHelloString;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestRIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html");
		
		PrintWriter pWriter=response.getWriter();
		pWriter.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		pWriter.println("<HTML>");
		pWriter.println("<HEAD><TITLE>资源注入</TITLE></HEAD>");
		pWriter.println("<b>注入的字符串:</b>" + szHelloString + "<br />");
		
		pWriter.println("<BODY>");
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
	}

}
