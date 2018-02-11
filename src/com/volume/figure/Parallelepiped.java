package com.volume.figure;

public class Parallelepiped extends Prism{	
	
	public Parallelepiped(
			double numbersOfSides,
			double side,
			double hight,			
			double angle,
			double diagonal,
			double areas,
			double radius,
			double sideB
			) {
		super(numbersOfSides, side, hight, angle, diagonal, areas, radius, sideB);

	}

	@Override
	public double area(double numberOfSides, double h, double angle, double diagonal, double radius, double sideA, double sideB) {
		sideA = this.side;
		sideB = this.sideB;
		return sideA*sideB;
	}

	@Override
	public double volume(double h2, double area) {		
		return area= area(numbersOfSides, hight, angle, diagonal, radius ,side, sideB)*h2;
	}		
}
