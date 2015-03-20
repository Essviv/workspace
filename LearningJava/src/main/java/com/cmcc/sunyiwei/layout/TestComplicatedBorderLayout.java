package com.cmcc.sunyiwei.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class TestComplicatedBorderLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel mainPanel=new JPanel();
		
		JPanel[] subPanels=new JPanel[5];
		for(int i=0;i<5;i++)
		{
			subPanels[i]=new JPanel();
			JButton[] buttons=Utilities.getButtons(5, 5*i);
			setPanel(subPanels[i], buttons);
		}
		
		setPanel(mainPanel, subPanels);
		
		JFrame mainFrame=new JFrame();
		mainFrame.setContentPane(mainPanel);
		Utilities.setMainFrame(mainFrame);
	}
	
	public static void setPanel(JPanel parentPanel, JPanel[] subPanels)
	{
		if(parentPanel==null || subPanels==null || subPanels.length!=5)
			return;
		
		parentPanel.setLayout(new BorderLayout());
		parentPanel.add(subPanels[0], BorderLayout.WEST);
		parentPanel.add(subPanels[1], BorderLayout.NORTH);
		parentPanel.add(subPanels[2], BorderLayout.EAST);
		parentPanel.add(subPanels[3], BorderLayout.SOUTH);
		parentPanel.add(subPanels[4], BorderLayout.CENTER);
		
		return;
	}
	
	public static void setPanel(JPanel panel, JButton[] buttons)
	{
		if(panel==null || buttons==null)return;
		if(buttons.length!=5)return;
		
		panel.setLayout(new BorderLayout());
		panel.add(buttons[0], BorderLayout.WEST);
		panel.add(buttons[1], BorderLayout.NORTH);
		panel.add(buttons[2], BorderLayout.EAST);
		panel.add(buttons[3], BorderLayout.SOUTH);
		panel.add(buttons[4], BorderLayout.CENTER);
		
		return;
	}

//	public static JPanel getPanel()
//	{
//		
//		JPanel mainPanel=new JPanel();
//		BorderLayout mainLayout=new BorderLayout();
//		mainPanel.setLayout(mainLayout);
//		
//		JPanel[] subPanels=new JPanel[5];
//		for(int i=0;i<5;i++)
//		{
//			subPanels[i]=new JPanel();
//			BorderLayout subLayout=new BorderLayout();
//			subPanels[i].setLayout(subLayout);
//		}
//		
//		mainPanel.add(subPanels[0], BorderLayout.WEST);
//		mainPanel.add(subPanels[0], BorderLayout.NORTH);
//		mainPanel.add(subPanels[0], BorderLayout.EAST);
//		mainPanel.add(subPanels[0], BorderLayout.SOUTH);
//		mainPanel.add(subPanels[0], BorderLayout.CENTER);
//		
//		return mainPanel;
//	}
}
