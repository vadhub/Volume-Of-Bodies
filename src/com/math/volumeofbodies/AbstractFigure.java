package com.math.volumeofbodies;

public abstract class AbstractFigure {
	public double sideA;
	public double sideB;
	public double hight;
	public double angle;
	public double diagonal;
	public double areas;
	
	public AbstractFigure(double sideA, double sideB, double hight,double angle, double diagonal, double areas) {
		this.angle = angle;
		this.areas = areas;
		this.diagonal = diagonal;
		this.sideA = sideA;
		this.sideB = sideB;
		this.hight = hight;
	}
}