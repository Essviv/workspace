package com.cmcc.sunyiwei;

import com.cmcc.sunyiwei.Author;

public class FairyTaleAuthor extends Author {
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public static void main(String[] args) {
		FairyTaleAuthor author = new FairyTaleAuthor();
		author.setName("343");
		System.out.println(author.getName());
	}
}
