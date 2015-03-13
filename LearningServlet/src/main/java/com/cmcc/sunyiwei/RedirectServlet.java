/**   
 * @FileName: RedirectServlet.java 
 * @Package:com.cmcc.sunyiwei 
 * @Description: TODO
 * @author: sunyiwei  
 * @date:2015年3月10日 下午10:17:51 
 * @version V1.0   
 */
package com.cmcc.sunyiwei;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: RedirectServlet 
 * @Description: TODO
 * @author: sunyiwei
 * @date:2015年3月10日 下午10:17:51 
 */
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.getWriter().println("Surprise!");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
