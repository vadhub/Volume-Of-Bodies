package com.volumefigure.starter;


import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.volume.gui.Action;
import com.volumefigure.fgurestereometry.Prism;
import com.volumefigure.figureplanimetry.Polygon;

public class Starter {
	public static void main(String[] args) {
		double width = 0;
		int length = 0;
		double height = 0;
		
		Polygon polygon = new Polygon("Vad",1, length ,width);
		Prism prism = new Prism("Prism",polygon.areaStandart(),height);
		JFrame display = new JFrame("Frame");
		JPanel panel = new JPanel(new FlowLayout());
		JPanel center = new JPanel(new BorderLayout());
		JTextField x = new JTextField(10);
		JTextField y = new JTextField(10);
		JTextField z = new JTextField(10);
		Choice ch= new Choice();
		ch.add("Prism");
		ch.add("Pyramid");

		JLabel labelX = new JLabel("X:");
		JLabel labelY = new JLabel("Y:");
		JLabel labelZ = new JLabel("Z:");

		JTextField conclision = new JTextField(10);
		
		Action a = new Action(width, length, height, x.getText(), y.getText(), z.getText(),prism.volume(), conclision);

		JButton ok = new JButton("OK");
		ok.addActionListener(a);
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
		display.setBounds(500, 400, 160, 180);
		display.setVisible(true);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

	}

}
