package com.math.volumeofbodies;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.JobAttributes;
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
	
	static int a = 0;	
	
	static int b = 0;
	
	static int c = 0;
	
	static double volume = 0;
	
	static double numbersOfSides = 0;
	static double hight = c;
	static double angle = 0;
	static double diagonal = 0;
	static double radius = 0;
	static double sideA = a;
	static double sideB = b;

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JButton btn1 = new JButton("Valume");
		
		JTextField inText1= new JTextField(4);
		JTextField inText2 = new JTextField(4);
		JTextField inText3 = new JTextField(4);	
		
		inText1.setText("0");
		inText2.setText("0");
		inText3.setText("0");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				a = Integer.valueOf(inText1.getText());
				b = Integer.valueOf(inText2.getText());
				c = Integer.valueOf(inText3.getText());
				
				Parallelepiped par = new Parallelepiped(numbersOfSides, hight, angle, diagonal, radius, sideA, sideB);
				
				double areas = par.area(numbersOfSides, hight, angle, diagonal, radius, sideA, sideB);
				
				volume = par.volume(c, areas);
				
				System.out.println(a+""+b+""+c);
				
				JOptionPane.showMessageDialog(null, volume);
			}
		});	
		
		JPanel tPanel = new JPanel(new FlowLayout());
		JPanel bPanel = new JPanel(new FlowLayout());	
		
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
