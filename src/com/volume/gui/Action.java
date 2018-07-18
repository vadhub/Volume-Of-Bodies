package com.volume.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.volumefigure.abstractfigure.AbstractFigure;

public class Action implements ActionListener {

	private double conclision;
	
	private AbstractFigure abstr1;
	private AbstractFigure abstr2;
	private JTextField field;	

	public Action(double conclision, JTextField field,AbstractFigure abstr1,AbstractFigure abstr2) {
		this.abstr1 = abstr1;
		this.abstr2 = abstr2;
		this.conclision = conclision;		
		this.field = field;
		field = new JTextField();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() != null) {			
			field.setText(Double.toString(conclision));		
			
		}
	}
}
