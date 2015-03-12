package com.cmcc.sunyiwei;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cmcc.sunyiwei.customlistener.CustomEventListener;
import com.cmcc.sunyiwei.customlistener.CustomEventPublisher;

@Configuration
public class AnnotationConfigTest {
	@Bean
	public HelloWorld helloWorld()
	{
		return new HelloWorld();
	}
	
	@Bean
	public TextEditor textEditor()
	{
		return new TextEditor();
	}
	
	@Bean
	public SpellCheckor spellCheckor()
	{
		return new SpellCheckor();
	}
	
	@Bean
	public StartEventHandlerImpl startEventHandler()
	{
		return new StartEventHandlerImpl();
	}
	
	@Bean
	public StopEventHandlerImpl stopEventHandler()
	{
		return new StopEventHandlerImpl();
	}
	
	@Bean
	public CustomEventPublisher customEventPublisher()
	{
		return new CustomEventPublisher();
	}
	
	@Bean
	public CustomEventListener customEventListener()
	{
		return new CustomEventListener();
	}
}
