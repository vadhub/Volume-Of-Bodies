package com.volumefigure.starter;


import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.volumefigure.fgurestereometry.Prism;
import com.volumefigure.figureplanimetry.Polygon;

public class Starter {
	
	static double width;
	static double length ;
	static double height;			
	
	public static void main(String[] args) {
		
		JFrame display = new JFrame("Frame");
		JPanel panel = new JPanel(new FlowLayout());
		JPanel center = new JPanel(new BorderLayout());
		
		
		Choice ch= new Choice();		
		ch.add("Prism");
		ch.add("Pyramid");

		JLabel labelX = new JLabel("X:");
		JLabel labelY = new JLabel("Y:");
		JLabel labelZ = new JLabel("Z:");

		JTextField conclision = new JTextField(10);
		
		JTextField x = new JTextField(10);
		JTextField y = new JTextField(10);
		JTextField z = new JTextField(10);	
		
		JButton ok = new JButton("OK");
		
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				width = Double.parseDouble(x.getText());
				length = Integer.parseInt(y.getText());
				height = Double.parseDouble(z.getText());
				
				Polygon polygon = new Polygon("V",length, 4 ,width);
				Prism prism = new Prism("P",polygon.areaRectangleStandart(),height);
				
				conclision.setText(String.valueOf(prism.volume()));
								
			}
		});
		panel.add(ch);
		panel.add(labelX);
		panel.add(x);
		panel.add(labelY);
		panel.add(y);
		panel.add(labelZ);
		panel.add(z);
		panel.add(ok);
		panel.add(conclision);
		center.add(panel,"Center");		
		
		display.add(center);	
		display.setBounds(500, 400, 180, 200);
		display.setVisible(true);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

	}

}
