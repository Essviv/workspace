package com.cmcc.sunyiwei.spring;

public class LowerAction implements Action {

	private String szMessage;

	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// }

	public String getMessage() {
		return szMessage;
	}

	public void setMessage(String szMessage) {
		this.szMessage = szMessage;
	}

	public String execute(String str) {
		// TODO Auto-generated method stub
		return (getMessage() + str).toLowerCase();
		// return null;
	}

}
