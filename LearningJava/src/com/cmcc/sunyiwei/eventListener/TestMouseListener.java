package com.cmcc.sunyiwei.eventListener;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.CORBA.Environment;

import com.cmcc.sunyiwei.Utilities;

public class TestMouseListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
//		JCheckBox
		
		final JTextArea textField=new JTextArea("Ë«»÷");
		textField.setSize(300,500);
		textField.setVisible(true);
		
		JScrollPane mainPanel=new JScrollPane(textField);
//		mainPanel.setSize(300, 500);
//		mainPanel.setLayout(new BorderLayout());
//		mainPanel.add(textField);
		mainFrame.setContentPane(mainPanel);
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String szText=textField.getText();
				szText+=e.toString();
				szText+="\n";
				textField.setText(szText);
			}
			
			public void mouseMoved(MouseEvent e){
				String szText=textField.getText();
				szText+=e.toString();
				szText+="\n";
				textField.setText(szText);
			}
			
			public void mouseEntered(MouseEvent e) {
				String szText=textField.getText();
				szText+=e.toString();
				szText+="\n";
				textField.setText(szText);
			}
		});
		
		Utilities.setMainFrame(mainFrame);
	}

}
