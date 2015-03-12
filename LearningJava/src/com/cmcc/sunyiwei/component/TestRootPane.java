package com.cmcc.sunyiwei.component;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import com.cmcc.sunyiwei.Utilities;

public class TestRootPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
		JRootPane rootPane=mainFrame.getRootPane();
		
		//glass pane
		JPanel glassPanel=new JPanel();
		glassPanel.setBackground(new Color(0, 255, 0));
		glassPanel.setVisible(true);
		glassPanel.setSize(300, 200);
//		rootPane.setGlassPane(glassPanel);
		
		//layered pane
		JMenuBar menuBar=new JMenuBar();
		JMenu fileMenu=new JMenu("ÎÄ¼þ");
		fileMenu.add(new JMenuItem("ÍË³ö"));
		menuBar.add(fileMenu);
		
		JPanel contentPanel=new JPanel();
		contentPanel.setBackground(new Color(0, 0, 255));
		contentPanel.setSize(300, 300);
		
		JLayeredPane layeredPanel=new JLayeredPane();
		layeredPanel.setSize(300, 300);
//		layeredPanel.add(menuBar);
//		layeredPanel.setLayer(menuBar,  JLayeredPane.PALETTE_LAYER);
		layeredPanel.add(contentPanel, JLayeredPane.FRAME_CONTENT_LAYER);
				
		mainFrame.setJMenuBar(menuBar);
//		rootPane.setJMenuBar(menuBar);
		rootPane.setGlassPane(glassPanel);
		rootPane.setLayeredPane(layeredPanel);
//		mainFrame.setContentPane(rootPane);
//		mainFrame.setContentPane(glassPanel);
//		mainFrame.setRoo
		Utilities.setMainFrame(mainFrame);
	}

}
