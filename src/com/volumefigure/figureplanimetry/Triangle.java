package com.volumefigure.figureplanimetry;

import com.volumefigure.numberaea.AreaTriangle;
import com.volumefigure.simplefigure.Line;

public class Triangle extends Line{
	
	private AreaTriangle areaTriangle = new AreaTriangle();	
	
	public Triangle(String name ,double lengthFoundation, double height) {
		setName(name);
		this.setWidth(lengthFoundation);
		this.setHight(height);
	}
	@Override
	public double areaStandart(){
		System.out.println("     "+getName());
		return areaTriangle.areaTwoVariable(getWidth(), getHight());
		
	}
}
