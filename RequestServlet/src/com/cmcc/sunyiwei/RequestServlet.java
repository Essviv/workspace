package com.cmcc.sunyiwei;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Local;

//import com.sun.prism.paint.Color;











import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageDecoder;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import sun.net.util.IPAddressUtil;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
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
		
		response.setContentType("image/jpeg");
		
		String randomString=getRandomString();
		request.getSession(true).setAttribute("randomString", randomString);
		
		int nWidth=100;
		int nHeight=30;
		
		Color color=getRandomColor();
		Color reverseColor=getReverseColor(color);
		
		BufferedImage image=new BufferedImage(nWidth, nHeight, 
			BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2d=image.createGraphics();
		graphics2d.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		graphics2d.setColor(color);
		graphics2d.fillRect(0, 0, nWidth, nHeight);
		graphics2d.setColor(reverseColor);
		graphics2d.drawString(randomString, 18, 20);
		for(int i=0, n=random.nextInt(50); i<n; i++)
		{
			graphics2d.drawRect(random.nextInt(nWidth), random.nextInt(nHeight), 
					1, 1);
		}
		
		ServletOutputStream outputStream=response.getOutputStream();
		JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(outputStream);
		encoder.encode(image);
		
		outputStream.flush();
//		response.setContentType("text/html");
//		String authType=request.getAuthType();
//		String localAddrString=request.getLocalAddr();
//		String localNameString=request.getLocalName();
//		int nLocalPort=request.getLocalPort();
//		
//		Locale locale=request.getLocale();
//		String contextPath=request.getContextPath();
//		String szMethod=request.getMethod();
//		String szPathInfo=request.getPathInfo();
//		String szPathTranslated=request.getPathTranslated();
//		String szProtocal=request.getProtocol();
//		String szQueryString=request.getQueryString();
//		
//		String szRemoteAddr=request.getRemoteAddr();
//		int nRemotePort=request.getRemotePort();
//		String szRemoteUserString=request.getRemoteUser();
//		
//		PrintWriter pWriter=response.getWriter();
		Cookie[] cookies=request.getCookies();
		System.out.println(cookies.length);
		for(Cookie cookie: cookies)
		{
			System.out.println(cookie.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	private String getAccept(String accept)
	{
		StringBuilder sBuilder=new StringBuilder();
		if(accept.contains("image/gif"))sBuilder.append("GIF文件, ");
		if(accept.contains("image/x-xbitmap"))sBuilder.append("BMP文件, ");
		if(accept.contains("image/jpeg"))sBuilder.append("JPG文件, ");
		if(accept.contains("application/vnd.ms-excel"))
			sBuilder.append("Excel文件, ");
		if(accept.contains("application/vnd.ms-powerpoint"))
			sBuilder.append("PPT文件, ");
		if(accept.contains("application/msword"))
			sBuilder.append("Word文件, ");
		
		return sBuilder.toString().replaceAll(", $", "");
	}
	
	private String getLocale(Locale locale)
	{
		if(Locale.SIMPLIFIED_CHINESE.equals(locale))
			return "简体中文";
		
		if(Locale.TRADITIONAL_CHINESE.equals(locale))
			return "繁体中文";
		
		if(Locale.ENGLISH.equals(locale))
			return "英文";
		
		if(Locale.JAPANESE.equals(locale))
			return "日文";
		
		return "其它语言";
	}
	
	private String getAddress(String ip)
	{
		return ip;
	}
	
	private String getNavigator(String userAgent) {
		if(userAgent.indexOf("TencentTraveler")>0)
			return "腾讯浏览器";
		
		if(userAgent.indexOf("Maxthon")>0)
			return "Maxthon浏览器";
		
		if(userAgent.indexOf("MyIE2")>0)
			return "MyIE2浏览器";
		
		if(userAgent.indexOf("Firefox")>0)
			return "Firefox浏览器";
		
		if(userAgent.indexOf("MSIE")>0)
			return "IE浏览器";
		
		return "其它浏览器";
	}
	
	private String getOS(String userAgent) {
		if(userAgent.indexOf("Windows NT 5.1")>0)
			return "Window XP";
		
		if(userAgent.indexOf("Windows 98")>0)
			return "Window 98";
		
		if(userAgent.indexOf("Windows NT 5.0")>0)
			return "Window 2000";
		
		if(userAgent.indexOf("Linux")>0)
			return "Linux";
		
		if(userAgent.indexOf("Unix")>0)
			return "Unix";
		
		return "其它操作系统";
	}
	
	private final char[] CHARS={'2', '3', '4', '5', '6', '7', '8', '9', 
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p',
			'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
	};
	
	private Random random=new Random();
	
	private String getRandomString()
	{
		final int nCount=6;
		StringBuilder stringBuilder=new StringBuilder();
		
		int nLength=CHARS.length;
		for(int i=0;i<nCount;i++)
			stringBuilder.append(CHARS[random.nextInt(nLength)]);
		
		return stringBuilder.toString();
	}
	
	private Color getRandomColor()
	{
		int nMax=256;
		return new java.awt.Color(random.nextInt(nMax), 
				random.nextInt(nMax), random.nextInt(nMax));
	}
	
	private Color getReverseColor(Color color)
	{
		int nMax=255;
		return new Color(nMax-color.getRed(), nMax-color.getGreen(),
				nMax-color.getBlue());
	}

}
