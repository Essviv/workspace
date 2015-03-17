/**   
 * @FileName: MainServlet.java 
 * @Package:com.cmcc.sunyiwei 
 * @Description: TODO
 * @author: sunyiwei  
 * @date:2015��3��10�� ����9:26:56 
 * @version V1.0   
 */
package com.cmcc.sunyiwei;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 * @ClassName: MainServlet
 * @Description: TODO
 * @author: sunyiwei
 * @date:2015��3��10�� ����9:26:56
 */
public class MainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// testSendRedirect(req, resp);
		// testDispatch(req, resp);
		// testQRCode(req, resp);
		// testServletConfig(req, resp);
		// testContextParams(req, resp);
//		testSessionId(req, resp);
//		testCookies(req, resp);
		testSessionListener(req, resp);
	}
	
	private void testSessionListener(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=utf-8");
		
		request.getSession().setAttribute("author", "sunyiwei");
		request.getSession().setAttribute("author", "sunyiwei");
		request.getSession().setAttribute("beanToBind", new BeanBindToSession("beanBindToSessionObject"));
		request.getSession().removeAttribute("author");
		request.getSession().removeAttribute("beanToBind");
		
		HttpSession session = request.getSession();
	}
	
	private void testCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=utf-8");
		
		Cookie authorCookie = new Cookie("author", "sunyiwei");
		response.addCookie(authorCookie);
		
		Map<String, String>map = new LinkedHashMap<String, String>();
		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			map.put(cookie.getName(), cookie.getValue());
		}
	
		request.setAttribute("map", map);
		request.getRequestDispatcher("/cookies.jsp").forward(request, response);
	}

	private void testCookies(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf8");
		
		Cookie cookie = new Cookie("author", "sunyiwei");
		response.addCookie(cookie);
		response.getWriter().println("�鿴response������...");
	}

	private void testSessionId(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf8");

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(2);

		if (session.isNew()) {
			response.getWriter().println("�ϸ��Ự�������������µĻỰ��");
		} else {
			response.getWriter().println("�һ����ϴ��Ǹ��ỰŶ~");
		}
		// request.getRequestDispatcher(response.encodeURL("/context.jsp"))
		// .forward(request, response);
		// response.sendRedirect(response.encodeURL("context.jsp"));
		// response.sendRedirect(response.encodeRedirectURL("context.jsp"));
		// if(session.isNew()){
		// response.getWriter().println("����ͻ����ǵ�һ�η���...");
		// }else{
		// response.getWriter().println("����ͻ�����֮ǰ���ʹ�...");
		// }
	}

	private void testContextParams(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Author author = (Author) getServletContext().getAttribute("author");
		request.setAttribute("author", author);
		request.getRequestDispatcher("/context.jsp").forward(request, response);
	}

	private void testServletConfig(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Map initParams = new HashMap<String, String>();
		Enumeration enumeration = getInitParameterNames();
		while (enumeration.hasMoreElements()) {
			String szKeyString = (String) enumeration.nextElement();
			initParams.put(szKeyString, getInitParameter(szKeyString));
		}

		Map contextParams = new HashMap<String, String>();
		Enumeration contextEnumeration = getServletContext()
				.getInitParameterNames();
		while (contextEnumeration.hasMoreElements()) {
			String szContextKey = (String) contextEnumeration.nextElement();
			contextParams.put(szContextKey, getServletContext()
					.getInitParameter(szContextKey));
		}
		request.setAttribute("servletData", initParams);
		request.setAttribute("contextData", contextParams);
		request.getRequestDispatcher("/ConfigParams.jsp").forward(request,
				response);
	}

	private void testDispatch(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	private void testSendRedirect(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		resp.sendRedirect("redirect.html");
	}

	private void testQRCode(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("image/jpg");

		// ���ɶ�ά��
		String szName = req.getParameter("name");
		String szAge = req.getParameter("age");
		String content = "com.cmcc.sunyiwei?" + "name=" + szName + "&age="
				+ szAge;

		MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
		Map hints = new HashMap();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		BitMatrix bitMatrix;
		try {
			bitMatrix = multiFormatWriter.encode(content,
					BarcodeFormat.QR_CODE, 400, 400, hints);
			MatrixToImageWriter.writeToStream(bitMatrix, "jpg",
					resp.getOutputStream());
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
