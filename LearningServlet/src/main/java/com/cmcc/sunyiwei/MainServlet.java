/**   
 * @FileName: MainServlet.java 
 * @Package:com.cmcc.sunyiwei 
 * @Description: TODO
 * @author: sunyiwei  
 * @date:2015年3月10日 下午9:26:56 
 * @version V1.0   
 */
package com.cmcc.sunyiwei;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

/**
 * @ClassName: MainServlet
 * @Description: TODO
 * @author: sunyiwei
 * @date:2015年3月10日 下午9:26:56
 */
public class MainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// testSendRedirect(req, resp);
		// testDispatch(req, resp);
//		testQRCode(req, resp);
//		testServletConfig(req, resp);
		testContextParams(req, resp);
	}

	private void testContextParams(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Author author = (Author)getServletContext().getAttribute("author");
		request.setAttribute("author", author);
		request.getRequestDispatcher("/context.jsp").forward(request, response);
	}
	
	private void testServletConfig(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Map initParams = new HashMap<String, String>();
		Enumeration enumeration = getInitParameterNames();
		while(enumeration.hasMoreElements()){
			String szKeyString = (String)enumeration.nextElement();
			initParams.put(szKeyString, getInitParameter(szKeyString));
		}
		
		Map contextParams = new HashMap<String, String>();
		Enumeration contextEnumeration = getServletContext().getInitParameterNames();
		while(contextEnumeration.hasMoreElements()){
			String szContextKey = (String)contextEnumeration.nextElement();
			contextParams.put(szContextKey, getServletContext().getInitParameter(szContextKey));
		}
		request.setAttribute("servletData", initParams);
		request.setAttribute("contextData", contextParams);		
		request.getRequestDispatcher("/ConfigParams.jsp").forward(request, response);
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

		// 生成二维码
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
