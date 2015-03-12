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
		JCheckBox basketBall=new JCheckBox("¿∫«Ú");
		JCheckBox footBall=new JCheckBox("◊„«Ú");
		JCheckBox pingPong=new JCheckBox("∆π≈“");
		JCheckBox baseBall=new JCheckBox("∞Ù«Ú");
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
