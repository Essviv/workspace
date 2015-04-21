package com.cmcc.sunyiwei.springframework;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Custom event handler: " + event.toString());
	}

}
