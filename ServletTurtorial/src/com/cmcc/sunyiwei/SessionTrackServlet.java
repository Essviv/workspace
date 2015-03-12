package com.cmcc.sunyiwei;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.border.TitledBorder;

public class SessionTrackServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		HttpSession session=req.getSession(true);
		
		String szCountKey="CountKey";
		String szIDKey="UserID";
		String szID="sunyiwei";
		int nCount=0;
		
		String szTitle;
		String szCreateTimeString=new Date(session.getCreationTime()).toString();//.toString();
		String szLastAccessTime=new Date(session.getLastAccessedTime()).toString();
		if(session.isNew())
		{
			szTitle="Welcom to my website!";
			session.setAttribute(szIDKey, szID);
		}
		else {
			szTitle="Weltome back!";
			nCount=(int) session.getAttribute(szCountKey);
		}
		session.setAttribute(szCountKey, ++nCount);
		
		String szDocType="<!DOCTYPE html public \"-//w3c//dtd html 4.0 transitional//en\">";
		PrintWriter pWriter=resp.getWriter();
		pWriter.println(szDocType);
		pWriter.println("<html>");
		pWriter.println("<head>");
		pWriter.println("<title bgcolor=#F00>");
		pWriter.println(szTitle);
		pWriter.println("</title>");
		pWriter.println("</head>");
		pWriter.println("<body>");
		pWriter.println("CreateTime: " + szCreateTimeString + "<br />");
		pWriter.println("Last Access Time: " + szLastAccessTime + "<br />");
		pWriter.println("Access count: " + nCount + "<br />");
		pWriter.println("</body>");
		pWriter.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		doGet(req, resp);
	}
}
