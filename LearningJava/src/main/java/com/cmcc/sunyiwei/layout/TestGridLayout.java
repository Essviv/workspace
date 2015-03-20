package com.cmcc.sunyiwei.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestGridLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
		JPanel mainPanel=getPanel(5, 4);
		mainFrame.setContentPane(mainPanel);
		
		Utilities.setMainFrame(mainFrame);
	}

	public static JPanel getPanel(int nCountX, int nCountY)
	{
		nCountX=Math.abs(nCountX);
		nCountY=Math.abs(nCountY);
		
		int nCount=nCountX*nCountY;		
		GridLayout layout=new GridLayout(nCountX, nCountY, 3, 3);
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(layout);
		
//		JButton[] buttons=new JButton[nCount];
		for(int i=0;i<nCount;i++)
		{
			mainPanel.add(
				new JButton("Button:" + String.valueOf(i)));
		}
		
		return mainPanel;
	}
}
