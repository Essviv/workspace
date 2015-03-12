package com.cmcc.sunyiwei.component;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import com.cmcc.sunyiwei.Utilities;

public class TestSplitPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSplitPane mainPanel=new JSplitPane();
		JFrame mainFrame=Utilities.getMainFrame(null);
		mainFrame.setContentPane(mainPanel);
//		mainPanel.setOneTouchExpandable(true);
		
		Utilities.setMainFrame(mainFrame);
	}

}
