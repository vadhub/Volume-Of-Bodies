package com.volume.figure;

import com.math.volumeofbodies.AbstractFigure;
import com.math.volumeofbodies.IVolume;

public class Pyramid extends AbstractFigure implements IVolume{
	
	private static double area;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		Pyramid.area = area;
	}

	public Pyramid(double sideA, double sideB, double hight, double angle, double diagonal, double areas) {
		super(sideA, sideB, hight, angle, diagonal, areas);	
	}
	

	@Override
	public double volume(double h, double area) {
		h = hight;
		this.setArea(area);
		return (area*h)/3;
	}	
	

}
