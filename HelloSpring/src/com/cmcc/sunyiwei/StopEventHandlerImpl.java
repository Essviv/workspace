package com.cmcc.sunyiwei;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandlerImpl implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Inside stop event handler...");
	}
}
