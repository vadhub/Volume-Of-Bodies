package com.volume.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() != null){
			System.out.println(doIt());	
		}
	}
	
	public Object doIt(){
		return 6;
	}
	
	
}
