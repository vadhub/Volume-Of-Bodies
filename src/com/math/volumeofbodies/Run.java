package com.math.volumeofbodies;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Run {

	public static void main(String[] args) {	
		
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel(new BorderLayout());

		JPanel tPanel = new JPanel(new FlowLayout());
		JPanel bPanel = new JPanel(new FlowLayout());

		JButton btn1 = new JButton("ok");

		frame.setSize(300, 200);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JTextField inText1= new JTextField(4);
		JTextField inText2 = new JTextField(4);
		JTextField inText3 = new JTextField(4);	
		
		JTextField outText = new JTextField(4);	
		
		inText1.setText("0");
		inText2.setText("0");
		inText3.setText("0");
		
		outText.setText("0");
		
		int a = Integer.valueOf(inText1.getText());
		int b = Integer.valueOf(inText2.getText());
		int c = Integer.valueOf(inText3.getText());		

		tPanel.add(inText1);
		tPanel.add(inText2);
		tPanel.add(inText3);

		bPanel.add(btn1);

		mainPanel.add("South", bPanel);
		mainPanel.add("North", tPanel);

		frame.add(mainPanel);

	}

}
