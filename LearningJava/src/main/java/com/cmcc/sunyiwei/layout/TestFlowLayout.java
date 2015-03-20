package com.cmcc.sunyiwei.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.cmcc.sunyiwei.Utilities;

public class TestFlowLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nCount=20;
		JButton[] buttons=Utilities.getButtons(nCount);
		
		FlowLayout layout=new FlowLayout();
		JFrame mainFrame=Utilities.getMainFrame(layout);
		for(int i=0;i< nCount;i++)
		{
			mainFrame.getContentPane().add(buttons[i]);
		}
		
		Utilities.setMainFrame(mainFrame);
	}

}
