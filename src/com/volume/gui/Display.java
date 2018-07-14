package com.volume.gui;

import java.awt.Component;

import javax.swing.JFrame;

public class Display extends JFrame{
	
	public Display(String name) {		
		setTitle(name);
	}
	
	@Override
	public Component add(Component comp) {
		System.out.println("Add: "+comp.getName());
		return super.add(comp);
	}
	
	
}
