package com.cmcc.sunyiwei.layout;

import java.awt.FlowLayout;
//import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import com.cmcc.sunyiwei.Utilities;

public class TestCheckBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JCheckBox basketBall=new JCheckBox("����");
		JCheckBox footBall=new JCheckBox("����");
		JCheckBox pingPong=new JCheckBox("ƹ��");
		JCheckBox baseBall=new JCheckBox("����");
//		baseBall.setBorderPainted(true);
//		baseBall.setBorderPaintedFlat(true);
		
		JFrame mainFrame=Utilities.getMainFrame(new FlowLayout());
		mainFrame.getContentPane().add(basketBall);
		mainFrame.getContentPane().add(footBall);
		mainFrame.getContentPane().add(pingPong);
		mainFrame.getContentPane().add(baseBall);
		
		Utilities.setMainFrame(mainFrame);
	}

}
