package com.cmcc.sunyiwei.layout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestBoxLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel mainPanel=new JPanel();
		BoxLayout layout=new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS);
		mainPanel.setLayout(layout);
		JButton[] buttons=Utilities.getButtons(50);
		for(int i=0;i<50;i++)
			mainPanel.add(buttons[i]);
		
		JFrame mainFrame=Utilities.getMainFrame(layout);
		mainFrame.setContentPane(mainPanel);
		Utilities.setMainFrame(mainFrame);
		
	}

}
//
//class TestBox{
//	public static void main(String[] args)
//	{
////		Box
//	}
//}
