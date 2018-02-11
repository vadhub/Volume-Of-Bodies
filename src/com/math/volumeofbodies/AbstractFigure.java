package com.math.volumeofbodies;

public abstract class AbstractFigure implements IFigureArea, IVolume{
	public double numbersOfSides;
	public double side;
	public double hight;
	public double angle;
	public double diagonal;
	public double areas;
	public double radius;
	
	public AbstractFigure(double numbersOfSides, double side, double hight,double angle, double diagonal, double areas, double radius) {
		this.angle = angle;
		this.areas = areas;
		this.diagonal = diagonal;
		this.numbersOfSides = numbersOfSides;
		this.side = side;
		this.hight = hight;
		this.radius = radius;
	}
}
