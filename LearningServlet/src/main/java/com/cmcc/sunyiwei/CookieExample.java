package com.cmcc.sunyiwei;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieExample
 */
public class CookieExample extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieExample() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		Map<String, String> map = new HashMap<String, String>();
		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			map.put(cookie.getName(), cookie.getValue());
		}
		request.setAttribute("map", map);
		request.getRequestDispatcher("showUserInfo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		String szName = request.getParameter("name");
		Cookie cookie = new Cookie("name", szName);
		response.addCookie(cookie);
		
//		request.getRequestDispatcher("showUserInfo.jsp").forward(request, response);
		doGet(request, response);
	}

}
