package com.cmcc.sunyiwei.springframework;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class TestContextStopListener implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println(event.getTimestamp() + ": " + "Context stopped...");
	}
	
}
