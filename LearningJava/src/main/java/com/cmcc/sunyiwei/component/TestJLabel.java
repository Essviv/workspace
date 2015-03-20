package com.cmcc.sunyiwei.component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestJLabel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel userNameLabel=new JLabel("”√ªß√˚:");
		JLabel pwdLabel=new JLabel("√‹¬Î:");
		
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(userNameLabel, BorderLayout.NORTH);
		mainPanel.add(pwdLabel, BorderLayout.SOUTH);
		
		JFrame mainFrame=new JFrame();
		mainFrame.add(mainPanel);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300, 300);
		mainFrame.setLocation(100, 100);
		mainFrame.setVisible(true);
	}

}
