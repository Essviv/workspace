package com.cmcc.sunyiwei.customlistener;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Custom event received...");
		System.out.println(arg0.toString());
	}
}
