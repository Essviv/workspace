/**
 * @Title: 	HelloWorldWithInitAndDestroy.java 
 * @Package com.cmcc.sunyiwei.springframework 
 * @author:	sunyiwei
 * @date:	2015年4月15日 下午8:16:30 
 * @version	V1.0   
 */
package com.cmcc.sunyiwei.springframework;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/** 
 * @ClassName:	HelloWorldWithInitAndDestroy 
 * @Description:  TODO
 * @author:	sunyiwei
 * @date:	2015年4月15日 下午8:16:30 
 *  
 */
public class HelloWorldWithInitAndDestroy implements InitializingBean,
		DisposableBean {
		private String name;
		
	/** 
	 * @Title: destroy 
	 * @Description: TODO
	 * @throws Exception 
	 * @see org.springframework.beans.factory.DisposableBean#destroy() 
	 */
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy...");
	}

	/** 
	 * @Title: afterPropertiesSet 
	 * @Description: TODO
	 * @throws Exception 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet() 
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
