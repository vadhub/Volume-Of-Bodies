package com.volume.figure;

public class Parallelepiped extends Prism{	
	
	public Parallelepiped(
			double numbersOfSides,			
			double hight,			
			double angle,
			double diagonal,
			double radius,
			double side,
			double sideB
			) {
		super(numbersOfSides, hight, angle, diagonal, radius, sideB, side);

	}

	@Override
	public double area(double numberOfSides, double hight, double angle, double diagonal, double radius, double sideA, double sideB) {
		sideA = this.side;
		sideB = this.sideB;
		return sideA*sideB;
	}

	@Override
	public double volume(double high, double area) {
		return area= area(numbersOfSides, hight, angle, diagonal, radius ,side, sideB)*high;
	}
}
