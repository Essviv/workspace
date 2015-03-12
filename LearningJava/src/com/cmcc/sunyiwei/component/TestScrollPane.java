package com.cmcc.sunyiwei.component;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.cmcc.sunyiwei.Utilities;

public class TestScrollPane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame=Utilities.getMainFrame(null);
		
		JTextField headerTextField=new JTextField("Header");
		JTextField textField=new JTextField("我也不知道我在写什么， 不过我就是想废话一会儿，不爽你咬我啊~");
		JScrollPane mainPane=new JScrollPane(textField);
		mainPane.setRowHeaderView(headerTextField);
//		mainPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		mainFrame.setContentPane(mainPane);
		Utilities.setMainFrame(mainFrame);
	}

}
