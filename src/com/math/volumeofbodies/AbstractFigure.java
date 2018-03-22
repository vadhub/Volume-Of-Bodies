package com.math.volumeofbodies;

public abstract class AbstractFigure implements IFigureArea, IVolume{
	public double numbersOfSides;	
	public double hight;
	public double angle;
	public double diagonal;
	public double radius;
	public double side;
	
	public AbstractFigure(double numbersOfSides, double hight,double angle, double diagonal, double radius,  double side) {
		this.angle = angle;
		this.diagonal = diagonal;
		this.numbersOfSides = numbersOfSides;		
		this.hight = hight;
		this.radius = radius;
		this.side = side;
	}
}
