package com.cmcc.sunyiwei.component;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.cmcc.sunyiwei.Utilities;

public class TestJButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton okButton=new JButton("È·¶¨");
		
		JFrame mainFrame=Utilities.getMainFrame(new BorderLayout());
		mainFrame.add(okButton);
		Utilities.setMainFrame(mainFrame);
	}

}
