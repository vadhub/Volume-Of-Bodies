package com.volumefigure.fgurestereometry;

import com.volume.numvolume.VolumePiramide;
import com.volumefigure.abstractfigure.AbstractFigure;

public class Pyramid extends AbstractFigure{
	private VolumePiramide volumePiramide = new VolumePiramide();
	public Pyramid(double area, double height) {
		setArea(area);
		setHight(height);
	}
	
	public double volume(){
		System.out.println("	"+getName());
		return volumePiramide.volume(getHight(), getArea());
	}
}
