package com.math.volumeofbodies;

public class Figure {
	public double sideA;
	public double sideB;
	public double hight;
	public double angle;
	public double diagonal;
	public double areas;
	
	public Figure(double sideA, double sideB, double hight,double angle, double diagonal, double areas) {
		this.angle = angle;
		this.areas = areas;
		this.diagonal = diagonal;
		this.sideA = sideA;
		this.sideB = sideB;
		this.hight = hight;
	}
	
}
