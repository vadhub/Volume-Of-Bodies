package com.math.volumeofbodies;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.volume.figure.Parallelepiped;

public class Run {	
	
	//s = (p*r)/2 - mn

	public static void main(String[] args) {	
		
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel(new BorderLayout());		
		
		JTextField inText1= new JTextField(4);
		JTextField inText2 = new JTextField(4);
		JTextField inText3 = new JTextField(4);
		
		int a = Integer.valueOf(inText1.getText());
		int b = Integer.valueOf(inText2.getText());
		int c = Integer.valueOf(inText3.getText());
		
		double numbersOfSides = 0;
		double hight = c;
		double angle = 0;
		double diagonal = 0;
		double radius = 0;
		double sideA = a;
		double sideB = b;
		
		Parallelepiped par = new Parallelepiped(numbersOfSides, hight, angle, diagonal, radius, sideA, sideB);
		
		double areas = par.area(numbersOfSides, hight, angle, diagonal, radius, sideA, sideB);
		
		double volume = par.volume(c, areas);
		
		JPanel tPanel = new JPanel(new FlowLayout());
		JPanel bPanel = new JPanel(new FlowLayout());

		JButton btn1 = new JButton("Valume");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, volume);				
			}
		});

		frame.setSize(300, 200);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);			
		
		tPanel.add(inText1);
		tPanel.add(inText2);
		tPanel.add(inText3);

		bPanel.add(btn1);

		mainPanel.add("South", bPanel);
		mainPanel.add("North", tPanel);

		frame.add(mainPanel);

	}

}
