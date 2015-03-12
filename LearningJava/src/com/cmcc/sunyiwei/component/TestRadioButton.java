package com.cmcc.sunyiwei.component;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import com.cmcc.sunyiwei.Utilities;

public class TestRadioButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JRadioButton fuJian=new JRadioButton("����", true);
		JRadioButton beiJing=new JRadioButton("����");
		JRadioButton xiaMeng=new JRadioButton("����");
		JRadioButton shangHai=new JRadioButton("�Ϻ�");
		
		//add to buttonGroup
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(fuJian);
		buttonGroup.add(beiJing);
		buttonGroup.add(shangHai);
		buttonGroup.add(xiaMeng);
		
		JFrame mainFrame=Utilities.getMainFrame(new FlowLayout());
		mainFrame.getContentPane().add(fuJian);
		mainFrame.getContentPane().add(beiJing);
		mainFrame.getContentPane().add(xiaMeng);
		mainFrame.getContentPane().add(shangHai);
		
		Utilities.setMainFrame(mainFrame);
	}

}
