package com.cmcc.sunyiwei.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestBorderLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nCount=20;
		JButton[] buttonList=Utilities.getButtons(nCount);
		
		BorderLayout layout=new BorderLayout();
		JFrame mainFrame=Utilities.getMainFrame(layout);
		
		JPanel panel=(JPanel)mainFrame.getContentPane();
		for(int i =0;i <nCount; i++)
		{
			switch (i%5) {
			case 0:
				panel.add(buttonList[i], BorderLayout.EAST);
				break;
			case 1:
				panel.add(buttonList[i], BorderLayout.WEST);
				break;
			case 2:
				panel.add(buttonList[i], BorderLayout.SOUTH);
				break;
			case 3:
				panel.add(buttonList[i], BorderLayout.NORTH);
				break;
			case 4:
				panel.add(buttonList[i], BorderLayout.CENTER);
				break;
			default:
				break;
			}
			
			Utilities.setMainFrame(mainFrame);
			
		}
	}

}
