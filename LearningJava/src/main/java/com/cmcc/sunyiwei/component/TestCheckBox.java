package com.cmcc.sunyiwei.component;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.cmcc.sunyiwei.Utilities;

public class TestCheckBox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
		
		final JCheckBox checkBox=new JCheckBox("≤‚ ‘");
		checkBox.setSize(100, 50);
		
//		checkBox.addInputMethodListener(new InputMethodListener() {
//			
//			public void inputMethodTextChanged(InputMethodEvent event) {
//				// TODO Auto-generated method stub
//				checkBox.setText("input method has been changed");
//			}
//			
//			public void caretPositionChanged(InputMethodEvent event) {
//				// TODO Auto-generated method stub
//				checkBox.setText(event.getText().toString());
//			}
//		});
//		checkBox.addChangeListener(new ChangeListener() {
//			
//			public void stateChanged(ChangeEvent e) {
//				// TODO Auto-generated method 
//				((JCheckBox)e.getSource()).setText(
//						String.valueOf(checkBox.isSelected()));
//			}
//		});
//		JButton
//		checkBox.addActionListener(new ActionListener() {
//			
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
////				((JCheckBox)e.getSource()).setText(
////						String.valueOf(checkBox.isSelected()));
//			}
//		});
		mainFrame.getContentPane().add(checkBox, BorderLayout.NORTH);
		
		Utilities.setMainFrame(mainFrame);
	}

}
