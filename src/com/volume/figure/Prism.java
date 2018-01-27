package com.volume.figure;

import com.math.volumeofbodies.AbstractFigure;
import com.math.volumeofbodies.IVolume;

public class Prism extends AbstractFigure implements IVolume{
	
	private static double area;

	public Prism(double sideA, double sideB, double hight, double angle,double diagonal, double areas) {
		super(sideA, sideB, hight, angle, diagonal, areas);		
	}	

	@Override
	public double volume(double h, double area) {
		h= hight;
		
		this.setArea(area);
		
		return area*h;
	}

	public static double getArea() {
		return area;
	}

	public void setArea(double area) {
		Prism.area = area;
	}
	
}
