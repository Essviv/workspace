package com.cmcc.sunyiwei;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandlerImpl 
	implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Inside start event handler...");
	}
}
