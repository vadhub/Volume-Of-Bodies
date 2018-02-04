package com.volume.figure;

import com.math.volumeofbodies.AbstractFigure;

public class Prism extends AbstractFigure{
	
	public Prism(double sideA, double sideB, double hight, double angle,double diagonal, double areas) {
		super(sideA, sideB, hight, angle, diagonal, areas);
	}

	@Override
	public double area(double numberOfSides, double h, double angle, double diagonal, double radius) {
		
		return 0;
	}

	@Override
	public double volume(double h, double area) {
		
		return 0;
	}	
	
}
