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

import com.volumefigure.fgurestereometry.Conus;
import com.volumefigure.fgurestereometry.Prism;
import com.volumefigure.fgurestereometry.Pyramid;
import com.volumefigure.figureplanimetry.Polygon;

public class Starter {
	
	static double width;
	static double length;
	static double height;
	
	public static void main(String[] args) {

		JFrame display = new JFrame("Frame");
		JPanel panelChoiser = new JPanel();
		JPanel panel = new JPanel(new FlowLayout());
		JPanel center = new JPanel(new BorderLayout());


		Choice ch= new Choice();
		ch.add("Prism");
		ch.add("Pyramid");
		ch.add("Conus");

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
				
				Polygon polygon = new Polygon(length, width);
				
				if(ch.getSelectedItem().equals("Rectangle")){
					Prism prism = new Prism("P",polygon.areaRectangleStandart(), height);
					conclision.setText(String.valueOf(prism.volume()));
					
				}else if(ch.getSelectedItem().equals("Pyramid")){
					Pyramid pyramid = new Pyramid(polygon.areaRectangleStandart(), height);
					
					conclision.setText(String.valueOf(pyramid.volume()));
				}else if(ch.getSelectedItem().equals("Conus")){
					Conus conus = new Conus(polygon.areaRectangleStandart(), height);
					conclision.setText(String.valueOf(conus.volume()));
				}
				
				

				

			}
		});
		panelChoiser.add(ch);
		panel.add(labelX);
		panel.add(x);
		panel.add(labelY);
		panel.add(y);
		panel.add(labelZ);
		panel.add(z);
		panel.add(ok);
		panel.add(conclision);
		center.add(panelChoiser,"North");
		center.add(panel);

		display.add(center);
		display.setBounds(500, 400, 160, 220);
		display.setVisible(true);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
