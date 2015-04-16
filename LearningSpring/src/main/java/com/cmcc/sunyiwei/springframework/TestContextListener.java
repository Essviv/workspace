package com.cmcc.sunyiwei.springframework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class TestContextListener implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println(event.getTimestamp() + ": " + "Context started...");
	}
	
}
