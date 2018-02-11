package com.volume.figure;

import com.math.volumeofbodies.AbstractFigure;

public abstract class Pyramid extends AbstractFigure{
	public Pyramid(
			double sideA,
			double sideB,
			double hight,
			double angle,
			double diagonal,
			double areas,
			double radius
			) {
		super(sideA, sideB, hight, angle, diagonal, areas, radius);	
	}
}
