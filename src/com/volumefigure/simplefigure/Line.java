package com.volumefigure.simplefigure;

public class Line extends Point {
	
	protected int numberOfPoints;

	public Line(double radius, double width) {
		this.setRadius(radius);
		this.setWidth(width);
	}
	
	public Line(int numberOfPoints){
		this.numberOfPoints = numberOfPoints;
	}

	public Line() {
	}
	
	public double leight(double leight){
		return leight;
	}
	
	public double areaStandart(){
		return numberOfPoints;
		
	}	
	
	
	
}
