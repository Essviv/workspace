/**
 * @Title: 	Test.java 
 * @Package com.cmcc.sunyiwei 
 * @author:	sunyiwei
 * @date:	2015年6月1日 下午4:22:05 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import com.cmcc.sunywei.util.DESCoder;
import com.jthb.ws.YYTServicePortBindingStub;
import com.jthb.ws.YYTServiceService;
import com.jthb.ws.YYTServiceServiceLocator;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author: sunyiwei
 * @date: 2015年6月1日 下午4:22:05
 * 
 */
public class Test {
	public static void main(String[] args) throws RemoteException, ServiceException {
		YYTServiceService service = new YYTServiceServiceLocator();
		YYTServicePortBindingStub stub = (YYTServicePortBindingStub) service.getYYTServicePort();

		String hbmsg = null;
		String json = "{\"token\":\"7f8fda5ee49935491fd9af6379082137\"}";
		DESCoder des = new DESCoder();
		String edresult = "";
		try {
			edresult = nchangeSpecialCode(des.encryptDES(json));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("传过去的消息：" + edresult);
		hbmsg = stub.getchecktoken(edresult);
		System.out.println("10086传来的消息未解密：" + hbmsg);

		String json_str = "";
		try {
			json_str = des.decryptDES(des.changeSpecialCode(hbmsg)
					.replaceAll("\\*", "+").replaceAll("-", "/"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("服务器解密消息：" + json_str);
	}

	/**
	 * 特殊字符转换
	 * 
	 * @param params
	 * @return
	 */
	private static String changeSpecialCode(String params) {
		// TODO Auto-generated method stub
		return params.replaceAll("%2B", "+").replaceAll("%3D", "=")
				.replaceAll("%2F", "/");
	}

	private static String nchangeSpecialCode(String params) {
		return params.replaceAll("\\+", "%2B").replaceAll("=", "%3D")
				.replaceAll("/", "%2F");
	}
}
