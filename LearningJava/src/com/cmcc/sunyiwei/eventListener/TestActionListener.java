package com.cmcc.sunyiwei.eventListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestActionListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
		
		JButton button=new JButton("点击我");
		button.addActionListener(new ActionListener() {
//			final int nCount=0;
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				if(nCount++%2==0)
				((JButton)e.getSource()).setText("我变了！");
			}
		});
		
		JPanel contentPanel=(JPanel)mainFrame.getContentPane();//
		contentPanel.add(button);
		button.setLocation(10, 10);
		button.setSize(100, 100);
		
//		mainFrame.setContentPane(contentPanel);
		Utilities.setMainFrame(mainFrame);
//		JFrame mainFrame=Utilities.getMainFrame(null);
//		mainFrame.getContentPane().setBackground(Color.red);
////		mainFrame.getContentPane().add(new JButton("确定"), 
////				BorderLayout.NORTH);
//		Utilities.setMainFrame(mainFrame);
	}

}
