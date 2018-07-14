package com.volumefigure.figureplanimetry;

import com.volumefigure.numberaea.AreaRectangle;
import com.volumefigure.simplefigure.Line;

public class Rectangle extends Line{
	protected double BASE_ANGL_CONST = 90;

	private AreaRectangle areaRectangle = new AreaRectangle();

	public Rectangle() {}

	public Rectangle(double diagonal) {
		this.setDiagonal(diagonal);
	}

	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setHight(length);		
	}

	public Rectangle(double width, double angle, double diagonal){
		this.setWidth(width);
		this.setDiagonal(diagonal);
		this.setAngle(angle);

	}
	@Override
	public double areaStandart(){
		return areaRectangle.areaTwoVariable(getWidth(), getHight());		
	}
	
}
