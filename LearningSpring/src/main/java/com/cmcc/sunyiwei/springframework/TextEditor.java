package com.cmcc.sunyiwei.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellCheckor spellCheckor;

	@Autowired(required = false)
	@Qualifier("sunyiwei")
	private String name;

	public TextEditor(SpellCheckor spellCheckor) {
		this.spellCheckor = spellCheckor;
	}

	public void spellCheck() {
		spellCheckor.spellCheck();
	}

	public SpellCheckor getSpellCheckor() {
		return spellCheckor;
	}

	@Autowired
	public void setSpellCheckor(SpellCheckor spellCheckor) {
		this.spellCheckor = spellCheckor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
