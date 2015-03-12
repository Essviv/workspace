package com.cmcc.sunyiwei.layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpinnerDateModel;
import javax.swing.SpringLayout;

import com.cmcc.sunyiwei.Utilities;

public class TestSpringLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel mainPanel=new JPanel();
		JButton okBtn=new JButton("确定");
		JButton cancelBtn=new JButton("取消");
		SpringLayout layout=new SpringLayout();
		mainPanel.setLayout(layout);
		
		mainPanel.add(okBtn);
		mainPanel.add(cancelBtn);
		layout.putConstraint(SpringLayout.NORTH, cancelBtn, 
				10, SpringLayout.SOUTH, okBtn);
		layout.putConstraint(SpringLayout.NORTH, okBtn, 10, 
				SpringLayout.NORTH, mainPanel);
		layout.putConstraint(SpringLayout.EAST, okBtn, -10, 
				SpringLayout.EAST, mainPanel);
		layout.putConstraint(SpringLayout.WEST, okBtn, 10, 
				SpringLayout.WEST, mainPanel);
		
		JFrame mainFrame=Utilities.getMainFrame(null);
		mainFrame.setContentPane(mainPanel);
		Utilities.setMainFrame(mainFrame);
		
		
	}

}
