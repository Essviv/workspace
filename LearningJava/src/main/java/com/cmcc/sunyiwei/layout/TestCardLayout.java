package com.cmcc.sunyiwei.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestCardLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestCardLayout testCardLayout=new TestCardLayout();
		testCardLayout.init();
	}
	
	private CardLayout mainLayout=null;
	private JPanel topPanel=null;
	public void init()
	{
		JFrame mainFrame=Utilities.getMainFrame(null);
		JPanel mainPanel=new JPanel();
		
		//add top panel
		mainLayout=new CardLayout(5, 5);
		topPanel=new JPanel(mainLayout);
		JPanel firstPanel=new JPanel();
		JPanel secondPanel=new JPanel();
		JPanel thirdPanel=new JPanel();
		JLabel firstLabel=new JLabel("第一页");
		firstPanel.setBackground(Color.red);
		JLabel secondLabel=new JLabel("第二页");
		secondPanel.setBackground(Color.green);
		JLabel thirdLabel=new JLabel("第三页");
		thirdPanel.setBackground(Color.blue);
		firstPanel.add(firstLabel);
		secondPanel.add(secondLabel);
		thirdPanel.add(thirdLabel);
		
		topPanel.add(firstPanel, "first");
		topPanel.add(secondPanel, "second");
		topPanel.add(thirdPanel, "third");
//		topPanel.setSize(300, 300);
		mainPanel.add(topPanel, BorderLayout.NORTH);
		
		//add bottom panel
		JPanel bottomPanel=new JPanel();
		JButton previousButton=new JButton("上一页");
		JButton firstButton=new JButton("1");
		JButton secondButton=new JButton("2");
		JButton thirdButton=new JButton("3");
		JButton nextButton=new JButton("下一页");
		
		bottomPanel.add(previousButton);
		bottomPanel.add(firstButton);
		bottomPanel.add(secondButton);
		bottomPanel.add(thirdButton);
		bottomPanel.add(nextButton);
		mainFrame.setContentPane(mainPanel);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		firstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainLayout.show(topPanel, "first");
			}
		});
		
		secondButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainLayout.show(topPanel, "second");
			}
		});
		
		thirdButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainLayout.show(topPanel, "third");
			}
		});
		
		previousButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainLayout.previous(topPanel);
			}
		});
		
		nextButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainLayout.next(topPanel);
			}
		});
		
		Utilities.setMainFrame(mainFrame);
	}

}
