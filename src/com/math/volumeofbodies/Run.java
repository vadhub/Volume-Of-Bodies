package com.math.volumeofbodies;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.volume.figure.Cube;

public class Run {

	public static void main(String[] args) {
		Cube cube = new Cube(10,10,0,0,0);				
		System.out.println(cube.volume(10, 10));
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel(new BorderLayout());

		JPanel tPanel = new JPanel(new FlowLayout());
		JPanel bPanel = new JPanel(new FlowLayout());

		JButton btn1 = new JButton("ok");

		frame.setSize(300, 300);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JTextField inText1= new JTextField(4);
		JTextField inText2 = new JTextField(4);
		JTextField inText3 = new JTextField(4);

		JTextField outText = new JTextField(4);

		tPanel.add(inText1);
		tPanel.add(inText2);
		tPanel.add(inText3);

		bPanel.add(btn1);

		mainPanel.add("South", bPanel);
		mainPanel.add("North", tPanel);

		frame.add(mainPanel);

	}

}
