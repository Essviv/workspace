package com.cmcc.sunyiwei.component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.cmcc.sunyiwei.Utilities;

public class TestTabbedPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTabbedPane mainPanel=new JTabbedPane();
		final int nCount=5;
		JInternalFrame[] panels=Utilities.getInternalFrames(nCount);
		for(int i=0;i<nCount;i++)
		{
//			mainPanel.addTab(null, panels[i]);
//			mainPanel.setTabComponentAt(i, panels[i]);
			mainPanel.add(panels[i]);
		}
//		JButton[] buttons=Utilities.getButtons(nCount);
//		for(int i=0;i<nCount;i++)
//			mainPanel.add(buttons[i]);
		mainPanel.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		JFrame mainFrame=Utilities.getMainFrame(null);
		mainFrame.setContentPane(mainPanel);
		Utilities.setMainFrame(mainFrame);
	}

}
