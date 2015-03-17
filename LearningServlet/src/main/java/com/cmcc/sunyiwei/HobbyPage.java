package com.cmcc.sunyiwei;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.FREE_MEM;

/**
 * Servlet implementation class HobbyPage
 */
public class HobbyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HobbyPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String szHobby = request.getParameter("hobby");
		
		List<String> friendNames = new ArrayList<String>();
		if(szHobby.trim().equalsIgnoreCase("speed dating")){
			friendNames.add("patrick");
			friendNames.add("lisa");
			friendNames.add("sunyiwei");
		}
		
		request.setAttribute("hobby", szHobby);
		request.setAttribute("friendNames", friendNames);
		request.getRequestDispatcher("hobby.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
