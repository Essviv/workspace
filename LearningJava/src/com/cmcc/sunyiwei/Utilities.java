package com.cmcc.sunyiwei;

//import java.awt.BorderLayout;
//import java.awt.GridBagLayout;
//import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class Utilities {
	public static JPanel getJPanel(Color color,
			int nX, int nY, int nWidth, int nHeight)
	{
		JPanel panel=new JPanel();
		//panel.add(new JButton(szContent));
		panel.setBackground(color);
		panel.setSize(nWidth, nHeight);
		panel.setLocation(nX, nY);
		
		return panel;
	}
	
	public static void setMainFrame(JFrame mainFrame) {
		if (mainFrame == null)
			return;

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300, 300);
		mainFrame.setLocation(100, 100);
		mainFrame.setVisible(true);
	}

	public static JFrame getMainFrame(LayoutManager layout) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(layout);

		JFrame mainFrame = new JFrame();
		mainFrame.setContentPane(mainPanel);
		// setMainFrame(mainFrame);

		return mainFrame;
	}

	public static JInternalFrame[] getInternalFrames(int nCount)
	{
		nCount = Math.abs(nCount);

		JInternalFrame[] checkBoxes = new JInternalFrame[nCount];
		for (int i = 0; i < nCount; i++)
		{
			checkBoxes[i] = new JInternalFrame();
			checkBoxes[i].setSize(30, 10);
			checkBoxes[i].setName("Panel:" + String.valueOf(i));
			checkBoxes[i].setClosable(true);
//			check
			JButton[] buttons=getButtons(nCount, 5*i);
			for(int j=0;j<nCount;j++)
			{
				checkBoxes[i].add(buttons[j]);
			}
		}

		return checkBoxes;
	}
	
	public static JPanel[] getPanels(int nCount)
	{
		nCount = Math.abs(nCount);

		JPanel[] checkBoxes = new JPanel[nCount];
		for (int i = 0; i < nCount; i++)
		{
			checkBoxes[i] = new JPanel();
			checkBoxes[i].setSize(30, 10);
			checkBoxes[i].setName("Panel:" + String.valueOf(i));
			
			JButton[] buttons=getButtons(nCount, 5*i);
			for(int j=0;j<nCount;j++)
			{
				checkBoxes[i].add(buttons[j]);
			}
		}

		return checkBoxes;
	}
	
	public static JCheckBox[] getCheckBoxs(int nCount)
	{
		nCount = Math.abs(nCount);

		JCheckBox[] checkBoxes = new JCheckBox[nCount];
		for (int i = 0; i < nCount; i++)
		{
			checkBoxes[i] = new JCheckBox("CheckBox:"
					+ String.valueOf(i));
			checkBoxes[i].setSize(30, 10);
		}

		return checkBoxes;
	}
	
	public static JButton[] getButtons(int nCount) {
		return getButtons(nCount, 0);
	}

	public static JButton[] getButtons(int nCount, int nOffset) {
		nCount = Math.abs(nCount);

		JButton[] buttonArray = new JButton[nCount];
		for (int i = 0; i < nCount; i++)
		{
			String szName="Button:"
					+ String.valueOf(i + nOffset);
			buttonArray[i] = new JButton(szName);
			buttonArray[i].setName(szName);
			buttonArray[i].setSize(30, 10);
		}

		return buttonArray;
	}

}
