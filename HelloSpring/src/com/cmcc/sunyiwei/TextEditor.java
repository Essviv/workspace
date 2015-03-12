package com.cmcc.sunyiwei;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	private SpellCheckor spellCheckor;
	
//	public TextEditor(SpellCheckor spellCheckor)
//	{
//		System.out.println("Inside textEditor constructor.");
//		this.spellCheckor=spellCheckor;
//	}
	
	public void spellCheck()
	{
		System.out.println("Inside textEditor spellChecking.");
		if(spellCheckor!=null)
			spellCheckor.spellCheck();
	}

	/**
	 * @return the spellCheckor
	 */
	public SpellCheckor getSpellCheckor() {
		return spellCheckor;
	}

	/**
	 * @param spellCheckor the spellCheckor to set
	 */
	@Required
	@Resource(name="spellCheckor")
	public void setSpellCheckor(SpellCheckor spellCheckor) {
		this.spellCheckor = spellCheckor;
	}
}
