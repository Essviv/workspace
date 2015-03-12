package com.cmcc.sunyiwei.layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.cmcc.sunyiwei.Utilities;

public class TestGridBagLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// JFrame mainFrame=Utilities.getMainFrame(layout);
//
//		JPanel mainPanel = new JPanel();
//		GridBagLayout layout = new GridBagLayout();
//		mainPanel.setLayout(layout);
//
//		JButton[] buttons = Utilities.getButtons(3);
//		for (int i = 0; i < 3; i++) {
//			GridBagConstraints constraints = new GridBagConstraints();
//			constraints.gridx = 0;
//			constraints.gridy = i;
//			constraints.fill = GridBagConstraints.HORIZONTAL;
//			constraints.insets = new Insets(5, 5, 5, 5);
//			constraints.weightx = 1;
//			constraints.weighty = 1;
//
//			mainPanel.add(buttons[i], constraints);
//		}
//
//		JCheckBox[] checkBoxs = Utilities.getCheckBoxs(3);
//		for (int i = 0; i < 3; i++) {
//			GridBagConstraints constraints = new GridBagConstraints();
//			constraints.gridx = 1;
//			constraints.gridy = i;
//			constraints.fill = GridBagConstraints.HORIZONTAL;
//			constraints.insets = new Insets(5, 5, 5, 5);
//			constraints.weightx = 1;
//			constraints.weighty = 1;
//
//			checkBoxs[i].setBorderPainted(true);
//			// checkBoxs[i].
//			mainPanel.add(checkBoxs[i], constraints);
//		}
//
//		JFrame mainFrame = Utilities.getMainFrame(null);
//		mainFrame.setContentPane(mainPanel);
//		Utilities.setMainFrame(mainFrame);
		
		JPanel mainPanel=new JPanel();
		
		//create component
		JLabel titleLabel=new JLabel("测试GridBagLayout布局");
		JLabel userNameLabel=new JLabel("用户名");
		JLabel pwdLabel=new JLabel("密码");
		JTextField userNameTextField=new JTextField(100);
		JTextField pwdTextField=new JTextField(100);
		JButton okButton=new JButton("确定");
		JButton cancelButton=new JButton("取消");
		
		GridBagLayout mainLayout=new GridBagLayout();
		mainPanel.setLayout(mainLayout);
		JFrame mainFrame=Utilities.getMainFrame(null);
		mainFrame.setContentPane(mainPanel);
		
		//add component
		addComponent(mainPanel, titleLabel, 1, 0, 3, 1, 1, 0, GridBagConstraints.CENTER);
		addComponent(mainPanel, userNameLabel, 0, 1, 1, 1, 0, 0, GridBagConstraints.BOTH);
		addComponent(mainPanel, userNameTextField, 1, 1, 4, 1, 0, 0, GridBagConstraints.BOTH);
		addComponent(mainPanel, pwdLabel, 0, 2, 1, 1, 0, 0, GridBagConstraints.BOTH);
		addComponent(mainPanel, pwdTextField, 1, 2, 4, 1, 0, 0, GridBagConstraints.BOTH);
		addComponent(mainPanel, okButton, 1, 3, 1, 1, 0, 0, GridBagConstraints.CENTER);
		addComponent(mainPanel, cancelButton, 3, 3, 1, 1, 0, 0, GridBagConstraints.CENTER);
		
		Utilities.setMainFrame(mainFrame);
	}
	
	public static void addComponent(JPanel panel, JComponent component, 
			int nX, int nY, 
			int nWidth, int nHeight,
			int nWeightX, int nWeightY,
			int nFillMode)
			{
				if(panel==null || component==null)
					return;
				
				GridBagConstraints constraints=new GridBagConstraints();
				constraints.gridx=nX;
				constraints.gridy=nY;
				constraints.gridwidth=nWidth;
				constraints.gridheight=nHeight;
				constraints.fill=nFillMode;
				constraints.weightx=nWeightX;
				constraints.weighty=nWeightY;
				
				panel.add(component, constraints);
			}

}
