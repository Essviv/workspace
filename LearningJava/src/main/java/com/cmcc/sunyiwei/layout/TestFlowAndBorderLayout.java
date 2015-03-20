package com.cmcc.sunyiwei.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
//import java.io.ObjectInputStream.GetField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestFlowAndBorderLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel[] panelArray=new JPanel[5];
		for(int i=0;i<5;i++)
		{
			String[] szContents=new String[5];
			for(int j=0;j<5;j++)
				szContents[j]="Button:" + String.valueOf(i*5+j);
			panelArray[i]=getSubPanel(szContents);
		}
		
		JFrame mainFrame=Utilities.getMainFrame(new FlowLayout());
		setMainPanel((JPanel)mainFrame.getContentPane(), panelArray);
		
		Utilities.setMainFrame(mainFrame);
	}
	
	public static void setMainPanel(JPanel mainPanel, JPanel[] subPanels)
	{
		if(mainPanel==null || subPanels==null)
			return;
		
		for(int i=0;i<subPanels.length;i++)
			mainPanel.add(subPanels[i]);
		
		return;
	}
	
	public static JPanel getSubPanel(String[] szContents)
	{
		if(szContents==null || szContents.length!=5)
			return null;
		
		JPanel subPanel=new JPanel();
		BorderLayout layout=new BorderLayout();
		subPanel.setLayout(layout);
		
		subPanel.add(new JButton(szContents[0]), BorderLayout.WEST);
		subPanel.add(new JButton(szContents[1]), BorderLayout.NORTH);
		subPanel.add(new JButton(szContents[2]), BorderLayout.EAST);
		subPanel.add(new JButton(szContents[3]), BorderLayout.SOUTH);
		subPanel.add(new JButton(szContents[4]), BorderLayout.CENTER);
		
		return subPanel;
	}

}
