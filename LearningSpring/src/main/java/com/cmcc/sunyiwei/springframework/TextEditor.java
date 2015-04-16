package com.cmcc.sunyiwei.springframework;

public class TextEditor {
	private SpellCheckor spellCheckor;

	public void spellCheck(){
		spellCheckor.spellCheck();
	}
	
	public SpellCheckor getSpellCheckor() {
		return spellCheckor;
	}

	public void setSpellCheckor(SpellCheckor spellCheckor) {
		this.spellCheckor = spellCheckor;
	}
	
	
}
