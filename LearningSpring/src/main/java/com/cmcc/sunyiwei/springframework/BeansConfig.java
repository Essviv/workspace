package com.cmcc.sunyiwei.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AnotherBeansConfig.class)
public class BeansConfig {
	@Bean
	public HelloWorld helloWorld(){
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("sunyiwei");
		return helloWorld;
	}
	
	@Bean
	public TestContextListener testContextListener(){
		return new TestContextListener();
	}
	
	@Bean
	public TestContextStopListener testContextStopListener(){
		return new TestContextStopListener();
	}
	
	@Bean
	public CustomEventHandler customEventHandler(){
		return new CustomEventHandler();
	}
	
	@Bean
	public CustomEventPublisher customEventPublisher(){
		return new CustomEventPublisher();
	}
}
