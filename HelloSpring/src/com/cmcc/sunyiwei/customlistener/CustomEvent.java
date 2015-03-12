package com.cmcc.sunyiwei.customlistener;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Im a custom event...";
	}
}
