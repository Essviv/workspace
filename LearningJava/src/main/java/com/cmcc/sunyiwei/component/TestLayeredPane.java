package com.cmcc.sunyiwei.component;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.cmcc.sunyiwei.Utilities;

public class TestLayeredPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
		JLayeredPane mainPanel=new JLayeredPane();
		
//		int nCount=5;
		int nWidth=40, nHeight=40;
		int nOffset=30;
//		int nLayer=0;
			
		int nPosX=0, nPosY=0, nLayer=0;
		JPanel firstPanel=Utilities.getJPanel(Color.red, 
				nPosX, nPosY, nWidth, nHeight);
		mainPanel.add(firstPanel);
		mainPanel.setLayer(firstPanel, nLayer);
		
		
		nPosX+=nOffset;
		nPosY+=nOffset;
		nLayer+=100;
		JPanel secondPanel=Utilities.getJPanel(Color.green, 
				nPosX, nPosY, nWidth, nHeight);
		mainPanel.add(secondPanel);
		mainPanel.setLayer(secondPanel, nLayer);
		
		nPosX+=nOffset;
		nPosY+=nOffset;
		nLayer+=100;
		JPanel thirdPanel=Utilities.getJPanel(Color.blue, 
				nPosX, nPosY, nWidth, nHeight);
		mainPanel.add(thirdPanel);
		mainPanel.setLayer(thirdPanel, nLayer);
		
		nPosX+=nOffset;
		nPosY+=nOffset;
		nLayer+=100;
		JPanel fourthPanel=Utilities.getJPanel(Color.cyan, 
				nPosX, nPosY, nWidth, nHeight);
		mainPanel.add(fourthPanel);
		mainPanel.setLayer(fourthPanel, nLayer);
		
		nPosX+=nOffset;
		nPosY+=nOffset;
		nLayer+=100;
		JPanel fifthPanel=Utilities.getJPanel(Color.pink, 
				nPosX, nPosY, nWidth, nHeight);
		mainPanel.add(fifthPanel);
		mainPanel.setLayer(fifthPanel, nLayer);
		
		mainFrame.setContentPane(mainPanel);
		Utilities.setMainFrame(mainFrame);
	}

}
