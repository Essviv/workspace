package com.cmcc.sunyiwei;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.compiler.Node.ForwardAction;

/**
 * Servlet implementation class TestInitParamServlet
 */
@WebServlet("/TestInitParamServlet")
public class TestInitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestInitParamServlet() {
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
		pWriter.println("<HEAD><TITLE>ÇëµÇÂ¼²é¿´</TITLE></HEAD>");
		pWriter.println("<BODY>");
		pWriter.println("<form action='" + request.getRequestURI() + "' method='post'>");
		pWriter.println("ÕËºÅ: <input type='text' name='username' style='width:200px; ' > <br/> " );
		pWriter.println("ÃÜÂë: <input type='text' name='password' style='width:200px; ' > <br/><br/> " );
		pWriter.println("<input type='submit' value=' µÇÂ¼ ' >");
		
		pWriter.println("</form>");
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
		String szUserNameString=request.getParameter("username");
		String szPasswordString=request.getParameter("password");
		
		ServletConfig config=getServletConfig();
//		Enumeration<String> enumStrings=this.getInitParameterNames();
		Enumeration<String> enumStrings=config.getInitParameterNames();
		ServletContext context=config.getServletContext();
//		context.get
		while(enumStrings.hasMoreElements())
		{
			String szCurrentUserNameString=enumStrings.nextElement();
			this.log("======:" + szCurrentUserNameString);
			String szCurrentPassword=this.getInitParameter(szCurrentUserNameString);
			
			if(szUserNameString.equalsIgnoreCase(szCurrentUserNameString)
					&& szPasswordString.equals(szCurrentPassword))
			{
				request.getRequestDispatcher("/WEB-INF/test.html");
				return;
//				forward(request, response);
			}
		}
		
		
		this.doGet(request, response);
	}

}
