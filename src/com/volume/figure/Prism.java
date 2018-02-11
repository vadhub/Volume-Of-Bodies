package com.volume.figure;

import com.math.volumeofbodies.AbstractFigure;

public abstract class Prism extends AbstractFigure {
	double sideB;	

	public Prism(
			double numbersOfSides,
			double side,
			double hight,
			double angle,
			double diagonal,
			double areas,
			double radius,
			double sideB			
			) {			
		super(numbersOfSides, side, hight, angle, diagonal, areas, radius);		
		this.sideB = sideB;
	}
	

}
