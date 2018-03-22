package com.volume.figure;

import com.math.volumeofbodies.AbstractFigure;

public abstract class Prism extends AbstractFigure {
	double sideB;	

	public Prism(
			double numbersOfSides,
			double hight,
			double angle,
			double diagonal,			
			double radius,
			double side,
			double sideB			
			) {			
		super(numbersOfSides, hight, angle, diagonal, radius, side);		
		this.sideB = sideB;
	}
	

}
