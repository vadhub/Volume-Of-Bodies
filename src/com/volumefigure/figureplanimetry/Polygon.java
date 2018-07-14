package com.volumefigure.figureplanimetry;

import com.volumefigure.numberaea.AreaPolygon;
import com.volumefigure.simplefigure.Line;

public class Polygon extends Line{
	private double halvePerimetr;
	private String name;
	
	private AreaPolygon areaPolygon = new AreaPolygon();
	
	public Polygon(String name ,double radius, double halvePirimetr) {
		this.name = name;
		this.halvePerimetr = halvePirimetr;
		setRadius(radius);
		}
	
	public Polygon(String name, double radius, int numberSides, double side) {
		this.name = name;
		setRadius(radius);
		setNumbersOfSides(numberSides);
		setWidth(side);
		
	}
	
	@Override
	public double areaStandart() {
		System.out.println("      "+name);
		return areaPolygon.areaThreeVariable(getRadius(), getWidth(),getNumbersOfSides());
	}	

	public double areaOfHalvePerimetr() {
		System.out.println("      "+name);
		return areaPolygon.areaThreeVariable(getRadius(), getWidth(),getNumbersOfSides());
	}
	
	public double getHalvePerimetr() {
		return halvePerimetr;
	}
	
	public void setHalvePirimetr(double halvePerimetr) {
		if(halvePerimetr>0){
		this.halvePerimetr = halvePerimetr;
		}else{
			System.err.println("halvePirimetr can`t negative"+halvePerimetr);
		}
	}
}
