package com.volume.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Action implements ActionListener {

	private double conclision;
	
	private JTextField field;
	
	private double x1;
	private double y1;
	private double z1;
	
	private String conclusonS;
	
	private String x2;
	private String y2;
	private String z2;

	public Action(double x1, double y1, double z1, String x2, String y2, String z2, double conclision, JTextField field) {
		this.conclision = conclision;		
		this.field = field;
		field = new JTextField();
		this.x1 = x1;
		this.y1 = y1;
		this.z1 = z1;

		this.x2 = x2;
		this.y2 = y2;
		this.z2 = z2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() != null) {
			x1 = Double.parseDouble(x2);
			y1 = Double.parseDouble(y2);
			z1 = Double.parseDouble(z2);
			field.setText(doIt());		
			
		}
	}

	public String doIt() {
		return conclusonS = Double.toString(conclision);
	}

}
