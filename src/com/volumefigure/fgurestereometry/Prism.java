package com.volumefigure.fgurestereometry;

import com.volume.numvolume.VolumePrism;
import com.volumefigure.abstractfigure.AbstractFigure;

public class Prism extends AbstractFigure{
	private VolumePrism volumePrism = new VolumePrism();
	
	public Prism() {}
	
	public Prism(String name, double area, double height) {
		setName(name);
		setArea(area);
		setHight(height);
	}
	
	public double volume(){
		System.out.println("	"+getName());
		return volumePrism.volume(getHight(), getArea());
	}
	
	
}
