package com.cmcc.sunyiwei.springframework;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void publish(){
		CustomEvent customEvent = new CustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
