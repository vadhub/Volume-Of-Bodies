package com.volumefigure.starter;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.volume.gui.Action;
import com.volume.gui.Display;

public class Starter {
	public static void main(String[] args) {
		Action a = new Action();
		Display display = new Display("Frame");
		JButton button = new JButton("As");
		button.addActionListener(a);
		display.setSize(400, 300);
		display.setVisible(true);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		display.add(button);
	}

}
