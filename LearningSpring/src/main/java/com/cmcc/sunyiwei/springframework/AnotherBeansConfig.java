package com.cmcc.sunyiwei.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherBeansConfig {

	@Bean
	public TextEditor textEditor() {
		// inject dependency
		return new TextEditor(spellCheckor());
	}

	@Bean
	public SpellCheckor spellCheckor() {
		return new SpellCheckor();
	}

}
